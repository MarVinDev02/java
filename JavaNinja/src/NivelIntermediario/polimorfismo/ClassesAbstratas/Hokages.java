package NivelIntermediario.polimorfismo.ClassesAbstratas;

public abstract class Hokages {
    public String nome;
    int idade;
    boolean vivoOuNao;
    String aldeia;
    int missoes;
    double saldoBancario;
    double altura;

    public abstract void sabedoriaHokage();

    public Hokages(){
    }

    public Hokages(String nome){
        this.nome = nome;
    }

    public Hokages(int idade){
        this.idade = idade;
    }
    //All args constructor-----------------------------------
    public Hokages(String nome, int idade, boolean vivoOuNao){
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;
    }

    public Hokages(double altura, double saldoBancario, int missoes,
                   String aldeia, boolean vivoOuNao, int idade, String nome) {
        this.altura = altura;
        this.saldoBancario = saldoBancario;
        this.missoes = missoes;
        this.aldeia = aldeia;
        this.vivoOuNao = vivoOuNao;
        this.idade = idade;
        this.nome = nome;
    }
}
