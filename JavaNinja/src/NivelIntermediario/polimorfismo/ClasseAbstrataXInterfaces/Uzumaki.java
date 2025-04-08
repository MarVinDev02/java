package NivelIntermediario.polimorfismo.ClasseAbstrataXInterfaces;

public class Uzumaki extends Ninja {
    public Uzumaki() {
        super(); //Referenciando a super classe.
    }

    public Uzumaki(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uzumaki(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, nivelNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    public void habilidadeEspeciial() {
        System.out.println("Sou " + nome + " e esse é meu ataque Uzumaki. Numero de missões: " + numeroDeMissoesConcluidas);
    }


    @Override
    public void estrategiaNinja() {
        System.out.println("Essa é minha estratégia ninja Uzumaki.");
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

    @Override
    public void tacarKunai() {
        System.out.println("sou um metodo da classe filha");
    }
}