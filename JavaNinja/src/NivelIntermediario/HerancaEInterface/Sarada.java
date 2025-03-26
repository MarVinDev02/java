package NivelIntermediario.HerancaEInterface;

public class Sarada extends Ninja implements HarunoUchiha{
    @Override
    public void ativarSharingan() {
        System.out.println("Ativou o Sharingan!");
    }

    @Override
    public void socoComChackra() {
        System.out.println("Ativou soco com Chackra!");
    }
}
