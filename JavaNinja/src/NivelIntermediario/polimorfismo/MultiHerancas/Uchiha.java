package NivelIntermediario.polimorfismo.MultiHerancas;

public class Uchiha extends Ninja implements interfaceUchihaHatake {
    @Override
    public void sharinganAtivado() {
        System.out.println("Sharingan Ativado!");
    }
}
