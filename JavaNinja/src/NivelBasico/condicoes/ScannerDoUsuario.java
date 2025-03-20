package NivelBasico.condicoes;

import java.util.Scanner;

public class ScannerDoUsuario {
    /*
    * Scanner = É um jeito de trazer um usuário para dentro da aplicação.
    * */



    public static void main(String[] args) {
        Scanner caixaDeTexto = new Scanner (System.in); // O Usuario tem liberdade de escrever.

        //Nome do ninja
        System.out.println("Escreva o nome do Ninja: ");
        String nomeDoNinja= caixaDeTexto.nextLine();
        System.out.println("O nome do ninja é " + nomeDoNinja);

        //Idade do ninja
        System.out.println("Escreva a idade do ninja: ");
        int idadeNinja = caixaDeTexto.nextInt();
        System.out.println("Idade: " + idadeNinja);

        if(idadeNinja >= 18) {
            System.out.println("Esse ninja ja é maior de idade e pode ir para missões fora da aldeia.");
        }else{
            System.out.println("Este ninja é muito novo ainda, precisa treinar mais antes de sair da vila.");
        }
        caixaDeTexto.close(); //Fecha o Scanner.
    }


}
