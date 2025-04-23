package pratica.zoo;

public class Main {
    public static void main(String[] args) {
        Camelo camelo = new Camelo("Ronaldo", 13);
        Leao leao = new Leao("Steve", 14);
        Papagaio papagaio = new Papagaio("Angenor", 12);

        camelo.fazerBarulho();
        leao.fazerBarulho();
        papagaio.fazerBarulho();
        
    }
}
