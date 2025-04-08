package NivelIntermediario.polimorfismo.ClassesAbstratas;

public class Main {
    public static void main(String[] args) {
        Senju hashirama = new Senju();
        hashirama.nome = "Hashirama";
        hashirama.idade = 45;
        hashirama.sabedoriaHokage();
    }
}

//Classe abstrata não pode ser instanciada.
//Métodos abstratos não podem ter corpo.
/*
* Métodos abstratos  criam uma super classe para padronizar outras classes filhas dela.
* Com isso, toda classe que herda-la, vai ter que incluir os métodos da classe abstrada.
* Do contrário dá erro.
*
* */