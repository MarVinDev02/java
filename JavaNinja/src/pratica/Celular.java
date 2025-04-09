package pratica;

import java.util.ArrayList;
import java.util.List;

public class Celular<T> {
   private List<T> instalador;

    public Celular() {
        this.instalador = new ArrayList<>();
    }

    public void instalarApp(T aplicativo){
        instalador.add(aplicativo);
    }

    public void mostrarAppsInstalador(){
        for (T aplicativos : instalador){
            System.out.println(aplicativos);
        }
    }

    public List<T> getInstalador() {
        return instalador;
    }

    public void setInstalador(List<T> instalador) {
        this.instalador = instalador;
    }

   

    

    
    
}
