package NivelIntermediario.ClasseAbstrataXInterfaces;

public class Main {
    public static void main(String[] args) {
        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.aldeia = "Aldeia da folha";
        naruto.idade = 18;
        naruto.numeroDeMissoesConcluidas = 14;
        naruto.habilidadeEspeciial();
        naruto.estrategiaNinja();
        naruto.tacarKunai();

        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.aldeia = "Aldeia da folha";
        sasuke.idade = 19;
        sasuke.habilidadeEspeciial();
        sasuke.estrategiaNinja();

        Uchiha sarada = new Uchiha("Sarada", "Aldeia da Folha", 10);
        sarada.estrategiaNinja();
        sarada.habilidadeEspeciial();

        Uzumaki boruto = new Uzumaki("Boruto", "Aldeia da folha", 15, 19, nivelNinja.GENNIN);
        boruto.estrategiaNinja();

        Uchiha madara = new Uchiha();
        //Metodo comum
        madara.inteligenciaDeCombate();
        //Metodo sobrecarregado
        madara.inteligenciaDeCombate(160);
        madara.metodoProvisorio();
        System.out.println(boruto);
        madara.tacarKunai();
    }
}

//Abstração = Escababilidade e Manutenção.
