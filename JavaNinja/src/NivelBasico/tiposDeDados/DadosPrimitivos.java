package NivelBasico.tiposDeDados;

public class DadosPrimitivos {
    public static void main(String[] args) {
        /**
         * Dados primitivos - int, double, float, chat, boolean, short.
         * Objetivo: Criar um ninja
         */

        int idade = 16; // int pode alocar 2 bilhões.
        double altura = 1.65;
        char inicial = 'n';
        boolean vivoOuMorto = true;
        Long saldoBancario = 999999L;

        //Sempre pensar na tipagem de dados para se previnir de qualquer problema.
        System.out.println("O saldo bancário é " + saldoBancario);
    }
}
