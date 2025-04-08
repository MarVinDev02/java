package NivelIntermediario.polimorfismo.Construtores;

public class Main {
    public static void main(String[] args) {
        Hokages hashirama = new Hokages();
        hashirama.nome = "Hashirama Senju";

        Hokages tobirama = new Hokages("Tobirama Senju");

        Hokages hiruzen = new Hokages(77);
        System.out.println(hiruzen.idade);

        Hokages minato = new Hokages("Minato Namikaze", 32, false);

        System.out.printf("""
                Nome: %s
                Idade: %s
                Vivo: %s
                """, minato.nome, minato.idade, minato.vivoOuNao);


    }
}
