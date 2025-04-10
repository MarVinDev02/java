package NivelIntermediario.records;

public class Ninja {
    //Posso por final quando o atributo tiver um construtor com parametros.
    private final String nome;
    private final String email;
    private final int telefone;

    public Ninja(String nome, String email, int telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }


    public String getEmail() {
        return email;
    }


    public int getTelefone() {
        return telefone;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + telefone;
        return result;
    }

    @Override
    public String toString() {

        return "Nome " + nome + "\nEmail: " + email + "\nTelefone: ";
    }
}
