package NivelIntermediario.MultiHerancas;

public class Hatake extends Ninja implements interfaceUchihaHatake, Anbu, HokageAtivo{
    public void boasVindas(){
        System.out.println(nome + " Eu sou um Hatake!");
    }

    @Override
    public void sharinganAtivado() {
        System.out.println("Sharingan do Kakashi ativado!");
    }

    @Override
    public void ninjaDeElite() {
        System.out.println("Sou um ninja Anbu!");
    }

    @Override
    public void HokageAtivo() {
        System.out.println("Sou um hokage ativo.");
    }
}
