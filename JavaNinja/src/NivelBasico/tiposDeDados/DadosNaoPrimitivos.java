package NivelBasico.tiposDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {
        //Métodos não primitivos recebem métodos.
        //Dados não primitivos: String, Array, Class, enum
        //Objetivo: Criar um ninja, atribuir métodos nele.

        String nome = "Naruto Uzumaki";
        String nomeEmCaixaAlta = nome.toUpperCase(); //Coloca tudo em CAPSLOCK
        System.out.println("Este texto está em CAPSLOCK: " + nomeEmCaixaAlta);

        String aldeia = "Aldeia da folha";
        String nomeEmCaixaBaixa = aldeia.toLowerCase();
        System.out.println(nomeEmCaixaBaixa);


    }
}
