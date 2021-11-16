package ClientHttp;

import java.io.IOException;
import java.net.ProxySelector;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ClientHttp {
/* Http 1.1 e http 2: o 2 consegue trabalhar com Multifixação. Toda vez que for trabalhar com uma requisição no
Http 1.1 ele chama uma requisição e espera uma resposta. Imagine que necessito de 6 requisições, teria q fazer umas
20 requisições para pegar o conteúdo daquela pagina, deu as 6, terá q esperar uma requisição responder para mandar
de novo. O Http 2 veio para quebrar esse paradigma. no 2 eu consigo em uma mesma conexão mandar de forma concorrente
várias requisições e alocar em uma Strams de frames
 */

    static ExecutorService executor = Executors.newFixedThreadPool(6, new ThreadFactory() {
        @Override
        public Thread newThread(Runnable r) {
            Thread thread = new Thread(r);
// isDaemon() é um método que não impede a JVM de finalizar. Algumas Thread impedem isso. ThreadGroup
            System.out.println("Nova Thread criada" + (thread.isDaemon() ? "Daemon" : "") + "Thread Group ::" + thread.getThreadGroup());
            return null;
        }
    });

    public static void main(String[] args) throws IOException, InterruptedException {
        connectAkamaiHttp11Client();

    }
        private static void connectAkamaiHttp11Client(){
            System.out.println("Running Http 1.1 exemple ...");
            try {
                HttpClient httpClient = HttpClient.newBuilder() // Configurando a versão do Http 1.1, por padrão é 2.0
                .version(HttpClient.Version.HTTP_1_1)
                        .proxy(ProxySelector.getDefault())
                        .build();

                long start = System.currentTimeMillis();//Contegem para fazer uma comparação com o Http 2

                HttpRequest mainRequest = HttpRequest.newBuilder()
                        .uri(URI.create("https://http2.akamai.com/demo/h2_demo_frame.html"))
                        .build();

                HttpResponse<String> response = httpClient.send(mainRequest, HttpResponse.BodyHandlers.ofString());

                System.out.println("Status Code ::: " + response.statusCode());
                System.out.println("response Headers" + response.headers());
                String responseBody = response.body();
                System.out.println(responseBody);



                List<Future<?>> future = new ArrayList<>();

                responseBody
                        .lines()
                        .filter(line -> line.trim().startsWith("img height"))
                        .map(line -> line.substring(line.indexOf("src ='") + 5, line.indexOf("'/>")))
                        .forEach(image -> {
                            Future<?> imgFuture = executor.submit(()-> {
                                HttpRequest imgRequest = HttpRequest.newBuilder()
                                        .uri(URI.create("https://http2.akamai.com" + image))
                                        .build();

                                try {
                                    HttpResponse<String> imageResponse = httpClient.send(imgRequest, HttpResponse.BodyHandlers.ofString());
                                    System.out.println("Imagem carregada :: " +image+", status code :: " +imageResponse.statusCode());
                                } catch (IOException e) {
                                    e.printStackTrace();
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                            });
                            future.add(imgFuture);
                            System.out.println("Submetido um Futuro para Imagem ::"+image);
                        });
                future.forEach(f-> {
                    try {
                        f.get();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (ExecutionException e) {
                        e.printStackTrace();
                    }
                });

                long end = System.currentTimeMillis();
                System.out.println("Tempo total de carregamento ::" + (end = start) + " ms");



            } catch (InterruptedException e){
                e.printStackTrace();
            } catch (IOException e){
                e.printStackTrace();
            }

            finally{
                executor.shutdown();
            }
    }

    private static void connectAndPrintURLJavaOracle() throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .GET().uri(URI.create("https://docs.oracle.com/javase/10/language/"))
                .build();
        //Responsável por fazer execução
        HttpClient httpClient = HttpClient.newHttpClient();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println("Status Code ::" + response.statusCode());
        System.out.println("Headers response :: " + response.headers());
        System.out.println(response.body());
    }
}
