package pratica.zoo;

public abstract class Animal implements CoisasDeAnimal {
    private String nome;
    private int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public void fazerBarulho() {
    }
}
