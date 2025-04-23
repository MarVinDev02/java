package pratica.zoo;

public class Camelo extends Animal {
    public Camelo(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void fazerBarulho() {
        System.out.println("Camelo fazendo barulho!");
    }
}
