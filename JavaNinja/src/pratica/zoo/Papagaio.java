package pratica.zoo;

public class Papagaio extends Animal{
    public Papagaio(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void fazerBarulho() {
        System.out.println("Uooooooohhhhrr");
    }
}
