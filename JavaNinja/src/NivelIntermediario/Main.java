package NivelIntermediario;

public class Main {
    public static void main(String[] args) {
        //Criar o ninja
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.aldeia = "Aldeia da folha";
        sasuke.idade = 18;
        sasuke.SharinganAtivado();

        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.aldeia = "Aldeia da folha";
        naruto.idade = 16;
        naruto.modoSabioAtivado();

        Haruno sakura = new Haruno();
        sakura.nome = "Sakura";
        sakura.aldeia = "Aldeia da folha";
        sakura.idade = 18;
        sakura.ativarCura();

        Hyuga hinata = new Hyuga();
        hinata.nome = "Hinata";
        hinata.aldeia = "Aldeia da folha";
        hinata.idade = 16;
        hinata.ativarByakugan();



    }
}