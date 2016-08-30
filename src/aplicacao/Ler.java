package aplicacao;

import java.util.Scanner;

public class Ler {
	private static Scanner scanner = new Scanner(System.in);

	public static int inteiro() {
		while (!scanner.hasNextInt()) {
			System.err.print("Digite um inteiro!");
			scanner.next();
		}

		return scanner.nextInt();
	}

	public static String linha() {
		return scanner.next();
	}
	
	public static void nextLine(){
		scanner.nextLine();
	}
}
