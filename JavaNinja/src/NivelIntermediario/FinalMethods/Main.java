package NivelIntermediario.FinalMethods;

public class Main {
    public static void main(String[] args) {
        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.aldeia = "Aldeia da folha";
        naruto.idade = 18;
        naruto.numeroDeMissoesConcluidas = 14;

        naruto.habilidadeEspeciial();
        System.out.println(naruto.altura);
        naruto.estrategiaNinja();
        System.out.println("------------------------");
        naruto.tacarKunai();
        System.out.println("------------------------");

        Anbu ninjaAnbu = new Anbu();
        ninjaAnbu.nome = "Ninja Aleatório";
        ninjaAnbu.anbu();
    }
}

//Abstração = Escababilidade e Manutenção.
