package NivelIntermediario.ClasseAbstrataXInterfaces;

public abstract class Ninja implements interfaceNinja{
    //TODO: Incluir novos 2 atributos, numeroMissoes, rank

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
        //Sobrecarga de metodos, não precisa redeclarar o construtor, apenas referencio.
        this(nome, aldeia, idade);
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.rank = rank;
    }

    public abstract void habilidadeEspeciial();

    @Override
    public void estrategiaNinja() {

    }
}