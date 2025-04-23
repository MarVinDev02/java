
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Funcionario funcionario = new Funcionario("Marcus", 01);
        Empresa empresa = new Empresa();
        String resposta = "N";
        // Perguntar se quer adicionar funcionario

        do {
            System.out.println("Adicione um funcionário!");
            // adicionar funcionario
            empresa.adicionarFuncionario(new Funcionario(entrada.nextLine(), entrada.nextInt()));
            System.out.println("Deseja por mais um usuario?");
            entrada.nextLine();
            resposta = entrada.nextLine();
        } while (!resposta.equalsIgnoreCase("N"));

        empresa.listarFuncionarios();

        entrada.close();
    }
}
