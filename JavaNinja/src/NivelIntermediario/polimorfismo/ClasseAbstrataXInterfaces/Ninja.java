package NivelIntermediario.polimorfismo.ClasseAbstrataXInterfaces;

public abstract class Ninja implements interfaceNinja {
    // TODO: Incluir novos 2 atributos, numeroMissoes, rank

    String nome;
    String aldeia;
    int idade;
    int numeroDeMissoesConcluidas;
    nivelNinja rank;

    public Ninja() {
    }

    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    public Ninja(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, nivelNinja rank) {
        // Sobrecarga de metodos, não precisa redeclarar o construtor, apenas
        // referencio.
        this(nome, aldeia, idade);
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.rank = rank;
    }

    public abstract void habilidadeEspeciial();

    @Override
    public void estrategiaNinja() {
        System.out.println("Meu nome é " + nome + " e essa é minha estratégia de combate.");

    }

    @Override
    public void inteligenciaDeCombate() {
        System.out.println("Meu nome é " + nome + " e essa é minha inteligência de combate.");
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

    public void metodoProvisorio(){
        System.out.println("teste");
    }

    @Override
    public String toString() {
        return "Meu nome é " + nome + " tenho " + idade + " anos e sou da " + aldeia;
    }

    public void tacarKunai(){
        System.out.println("SOU UM MÉTODO DA CLASSE MÃE");
    }
}