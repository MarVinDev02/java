package NivelIntermediario.records;

public class Main {
    public static void main(String[] args) {
        Ninja cadastro = new Ninja("Naruto", "Naruto@gmail.com", 999999);
        System.out.println(cadastro.getNome());
        
        
        System.out.println("----------Records-------");
        NinjaRecords ninjaRecords = new NinjaRecords("Edevaldo", 11111111);
        System.out.println(ninjaRecords);
        

        
    }
}