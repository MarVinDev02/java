package NivelBasico.desafios;

public class Desafio1 {
    public static void main(String[] args) {

        String nomeNinjaUm = "Naruto";
        int indadeNinjaUm = 17;
        String missaoNinjaUm = "O vale das sombras";
        char rankingMissaoNinjaUm = 'D';
        boolean statusConclusaoMissao = true;

        String nomeNinjaDois = "Gaara";
        int indadeNinjaDois = 16;
        String missaoNinjaDois = "O som do luar";
        char rankingMissaoNinjaDois = 'A';
        boolean statusConclusaoMissaoDois = false;

        String nomeNinjaTres = "Sasuke";
        int indadeNinjaTres = 14;
        String missaoNinjaTres = "O Mar sem fim";
        char rankingMissaoNinjaTres = 'B';
        boolean statusConclusaoMissaoTres = true;

        System.out.println("Nome: " + nomeNinjaUm);
        System.out.println("Idade: " +indadeNinjaUm);
        System.out.println("Missão: " + missaoNinjaUm);
        System.out.println("Ranking: " + rankingMissaoNinjaUm);
        System.out.println("Concluida: " + statusConclusaoMissao);




        if(indadeNinjaUm >= 15 && rankingMissaoNinjaUm == 'D' || rankingMissaoNinjaUm == ('C')){
            statusConclusaoMissao = true;
            System.out.println(statusConclusaoMissao);
        }else{
            statusConclusaoMissao = false;
            System.out.println(statusConclusaoMissao);
        }

    }
}
