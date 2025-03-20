package NivelBasico.condicoes;

public class Ternarios {
    public static void main(String[] args) {
        //Ternários: São if e else mais reduzidos.
        short numeroDeMissoes = 10;

        boolean nivelDoNinja = (numeroDeMissoes >= 10) ? true : false;

        if(nivelDoNinja){
            System.out.println("O ninja possui mais de dez missões.");
        }else{
            System.out.println("O ninja não possui mais de dez missões.");
        }

    }
}
