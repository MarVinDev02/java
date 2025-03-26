package pratica;

import java.util.Scanner;

public class OlaMundo {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual seu nome?");
		String nome = entrada.nextLine();
		System.out.println("Olá " + nome);
		
		
		entrada.close();
	}
}
