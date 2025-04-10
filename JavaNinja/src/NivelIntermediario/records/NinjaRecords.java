package NivelIntermediario.records;

public record NinjaRecords(String nomeDoFuncionario, int id) {
    //Todos os atributos são final em records
    // Records não possuem setter's

    @Override
    public final String toString() {

        return "Funcionário: " + nomeDoFuncionario + "\nId: " + id;
    }



}
