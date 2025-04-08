package NivelIntermediario.collections.list;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] ninjasArray = new String[3];
        ninjasArray[0] = "Naruto";
        ninjasArray[1] = "Sasuke";
        ninjasArray[2] = "Sakura";
        System.out.println(ninjasArray[0]);

        //Listas não são estáticas, elas podem aumentar e diminuir.
        List<String>  ninjasList = new ArrayList<>(); //Instancia lista

        //Adiciona elemento a lista
        ninjasList.add("Naruto");
        ninjasList.add("Sasuke");
        ninjasList.add("Sakura");
        ninjasList.add("Itachi");
        ninjasList.add("Kakashi");
        System.out.println(ninjasList);

        //Remove da lista;
        ninjasList.remove("Kakashi");
        System.out.println(ninjasList);

        //Trocar elemento na lista
        ninjasList.set(1, "Hinata");
        System.out.println(ninjasList);

        //Ver tamanho da lista
        System.out.println("Tamanho da lista: " + ninjasList.size());

    }

}
