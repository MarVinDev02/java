package NivelIntermediario.Sobrecarga;

public class Main {
    public static void main(String[] args) {
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.aldeia = "Aldeia da folha";
        sasuke.idade = 18;

        Hatake kakashi = new Hatake();
        kakashi.nome = "Kakashi Hataque";
        kakashi.aldeia = "Aldeia da folha";
        kakashi.idade = 48;
        kakashi.boasVindas();
        kakashi.sharinganAtivado();
        kakashi.ninjaDeElite();
        kakashi.HokageAtivo();

    }
}

//Abstração = Escababilidade e Manutenção.
