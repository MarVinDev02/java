package NivelIntermediario.ClasseAbstrataXInterfaces;

public class Uzumaki extends Ninja {
    public Uzumaki() {
        super(); //Referenciando a super classe.
    }

    public Uzumaki(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public void habilidadeEspeciial(){
        System.out.println("Sou " + nome + " e esse é meu ataque Uzumaki.");
    }

    @Override
    public void estrategiaNinja() {
        System.out.println("Essa é minha estratégia ninja.");
    }
}