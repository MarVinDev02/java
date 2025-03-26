package NivelIntermediario.ClasseAbstrataXInterfaces;

public class Uchiha extends Ninja {
    @Override
    public void habilidadeEspeciial() {
        System.out.println("Sou " + nome + " e esse é meu ataque Uchiha.");
    }
    public Uchiha(){
        super();
    }

    public Uchiha(String nome, String aldeia, int idade){
        super(nome, aldeia, idade);
    }

    @Override
    public void estrategiaNinja() {
        System.out.println("Sou " + nome + " e esse é meu método de batalha.");
    }
}
