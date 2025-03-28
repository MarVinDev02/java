package NivelIntermediario.ClasseAbstrataXInterfaces;

public class Uchiha extends Ninja {
    @Override
    public void habilidadeEspeciial() {
        System.out.println("Sou " + nome + " e esse é meu ataque Uchiha.");
    }

    public Uchiha() {
        super();
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uchiha(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, nivelNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    @Override
    public void estrategiaNinja() {
        System.out.println("Sou " + nome + " e esse é meu método de batalha.");
    }

    @Override
    public void inteligenciaDeCombate() {
        System.out.println("Essa é minha INTELIGENCIA!!!!");
    }

    @Override
    public void inteligenciaDeCombate(int qi) {
        if (qi > 150) {
            System.out.println("Seu QI é " + qi + " e você é um gênio.");
        } else if (qi >= 130) {
            System.out.println("Seu QI é " + qi + " e você é promissor.");
        } else {
            System.out.println("Você precisa treinar mais.");
        }
    }
}
