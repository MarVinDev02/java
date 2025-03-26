package NivelIntermediario.polimorfismo;

public class Main {
    public static void main(String[] args) {
        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.habilidadeEspecial();
        System.out.println("---------------");

        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke";
        sasuke.habilidadeEspecial();
    }
}
