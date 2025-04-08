package NivelIntermediario.generics2;

import java.util.ArrayList;
import java.util.List;

public class BolsaNinja<T> {
    //Iniciar Array
    private List<T> ferramentas;

    public BolsaNinja (){
        this.ferramentas = new ArrayList<>();
    }
    //Colocar ferramentas na lista.
    public void adicionarFerramenta(T ferramenta) {
        ferramentas.add(ferramenta);
    }

    //Mostrar lista de ferramentas
    public void mostrarFerramentas(){
        for(T ferramenta : ferramentas){
            System.out.println(ferramenta);
        }
    }

}
