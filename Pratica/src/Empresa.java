import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Empresa {

    Scanner entrada = new Scanner(System.in);
    private List<Funcionario> funcionarios = new ArrayList<>();
    Funcionario funcionario;

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);

    }

    public void listarFuncionarios() {
        System.out.println("Funcionarios: ");
        for (Funcionario funcionario : funcionarios) {
            System.out.println("Nome: " + funcionario.getNome() + " ID: " + funcionario.getId());
        }
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

}
