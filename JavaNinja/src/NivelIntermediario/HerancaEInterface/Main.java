package NivelIntermediario.HerancaEInterface;

public class Main {
    public static void main(String[] args) {
        //Criar o objeto
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

        System.out.println("----Boruto-----");
        Boruto boruto = new Boruto();
        boruto.nome = "Boruto Hyuga Uzumaki";
        boruto.aldeia = "Aldeia da folha";
        boruto.idade = 8;
        boruto.AtivarOKarma();
        boruto.AtivarJougan();

        Sarada sarada = new Sarada();
        sarada.nome = "Sarada Haruno Uchuha";
        sarada.aldeia = "Aldeia da folha";
        sarada.idade = 8;
        sarada.ativarSharingan();
        sarada.socoComChackra();
    }
}