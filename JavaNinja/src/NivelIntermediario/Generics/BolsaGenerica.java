package NivelIntermediario.Generics;

import java.util.ArrayList;
import java.util.List;

//Acionando o genérico.
public class BolsaGenerica<T> {
    //Startando lista genérica.
    private List<T> equipamentos;

    public BolsaGenerica() {
        this.equipamentos = new ArrayList<>();
    }

    //Adicionar equipamentos a lista genérica
    public void adicionarEquipamentos(T equipamento) {
        equipamentos.add(equipamento);
    }

    public List<T> getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(List<T> equipamentos) {
        this.equipamentos = equipamentos;
    }

    @Override
    public String toString() {
        return "Bolsa de equipamentos: " + equipamentos.toString();
    }
}
