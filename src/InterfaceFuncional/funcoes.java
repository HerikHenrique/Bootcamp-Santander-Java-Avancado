package InterfaceFuncional;

import java.util.function.Supplier;

public class funcoes {
    public static void main(String[] args){

        Supplier<Pessoa> instanciaPessoa = () -> new Pessoa();
        Supplier<Pessoa> instanciaPessoa2 = Pessoa::new;
        System.out.println(instanciaPessoa.get());
        System.out.println(instanciaPessoa2.get());

    }
}
class Pessoa {
    private String nome;
    private Integer idade;

    public Pessoa() {
        nome = "Herik";
        idade = 29;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s, Idade: %d", nome,idade);
    }
}


/*
Functions - RECEBEM UM PARAMETRO E DEVEM RESPONDER UM PARAMETRO TAMBÉM.
 */
