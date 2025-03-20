package NivelBasico.condicoes;

public class ifElse {
    public static void main(String[] args) {
       /*
       * Passar o ninja de nível de acordo com as missões.
       * */
        String nome = "Naruto Uzumaki";
       int idade = 17;
       boolean hokage = false;
       short numeroDeMissoes = 30;

       //se (condicao) {faça isso};
        //if - se
        //else - se não
        //else if - ou se

        if(numeroDeMissoes == 10 && idade > 15){
            System.out.println("Rank: Chunin");
        }else if(numeroDeMissoes >= 20){
            System.out.println("Rank: Jounin");
        }else{
            System.out.println("Rank: Genin");
        }

    }
}
