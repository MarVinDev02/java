package NivelBasico.desafios;

import java.util.Scanner;

public class CadastroNinjas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] ninja = new String[3];
        System.out.println("CADASTRO DE NINJAS");

        int contador = 0;
        int escolha = 0;

        for(int i = 0; i < ninja.length; i++){
            System.out.println("""
                    O que deseja fazer?
                    1 - Cadastrar ninja;
                    2 - Exibir nomes de ninjas cadastrados;
                    3 - Finalizar o processo;
                    """);
            escolha = entrada.nextInt();
            entrada.nextLine();

            switch (escolha) {
                case 1:
                    System.out.println("Digite o nome do ninja: ");
                    ninja[contador] = entrada.nextLine();
                    contador++;
                    break;
                case 2:
                    System.out.println("Ninjas cadastrados: ");
                    for (int h = 0; h < contador; h++) {
                        System.out.println(ninja[h]);
                    }
                    break;
                case 3:
                    System.out.println("Processo finalizado");
                    return;
            }
            if (contador == 3){
                System.out.println("Lista cheia!");
                for (int j = 0; j < contador; j++) {
                    System.out.println("Ninjas cadastrados: " + ninja[j]);
                }
                break;
            }

        }
    }
}
