package NivelBasico.condicoes;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        //Pedir ao usuário
        Scanner scanner = new Scanner(System.in);

        //Mostrar opções pro Usuário
        System.out.println("Escolha um personagem: ");
        System.out.println("Naruto Uzumaki - 1");
        System.out.println("Sasuke Uchiha - 2");
        System.out.println("Sakura Haruno - 3");

        //Pedir pro Usuário escolher um.
        int escolhaDoUsuario = scanner.nextInt();

        System.out.println("Você digitou o número " + escolhaDoUsuario);


        //Reacao ao escolher um personagem

        switch (escolhaDoUsuario) {
            case 1:
                System.out.println("Você escolheu o Naruto Uzumaki");
                break;
            case 2:
                System.out.println("Você escolheu o Sasuke Uchiha)");
                break;
            case 3:
                System.out.println("Você escolheu a Sakura Haruno");
                break;
            default:
                System.out.println("Você não escolheu ninguém.");
                break;
        }
        //Fechar a caixa
        scanner.close();
    }
}
