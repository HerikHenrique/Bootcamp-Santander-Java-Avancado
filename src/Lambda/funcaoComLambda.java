package Lambda;

public class funcaoComLambda {
    public static void main(String[] args) {
        Funcao colocarPrefixoSenhorNaString = valor -> "Sr." + valor;
        System.out.println(colocarPrefixoSenhorNaString.gerar("Herik"));
    }
}
