import java.util.List;

public class Empresa {
    private List<Funcionario> funcionarios;
    Funcionario funcionario;
    public void adicionarFuncionario(Funcionario funcionario){
        char resposta = 'N';
        while (resposta = ) {
            
        }
        funcionarios.add(funcionario);
    }

    public void listarFuncionarios(){
        System.out.println("Funcionarios: ");
        for(Funcionario funcionario : funcionarios){
            System.out.println("Nome: " + funcionario.nome() + " ID: " + funcionario.id());
        }
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    
}
