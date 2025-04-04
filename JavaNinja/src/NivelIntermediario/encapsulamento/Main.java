package NivelIntermediario.encapsulamento;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----------Naruto Uzumaki-----------");
        Uzumaki naruto = new Uzumaki("Naruto","Aldeia da folha", 17, 18, 1.75);
        System.out.println(naruto.getNome());
        //alterando o nome do naruto acessando o set.
        naruto.setNome("Naturo Uzumaki com nome alterado");
        System.out.println(naruto.getNome());

        System.out.println("-----------Sasuke Uchiha-----------");
    }
}
