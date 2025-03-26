package NivelIntermediario.ClasseAbstrataXInterfaces;

public abstract class Ninja implements interfaceNinja{
    String nome;
    String aldeia;
    int idade;

    public Ninja() {
    }

    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    public abstract void habilidadeEspeciial();

    @Override
    public void estrategiaNinja() {

    }
}