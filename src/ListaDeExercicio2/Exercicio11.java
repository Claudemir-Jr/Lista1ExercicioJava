package ListaDeExercicio2;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int N;
		
		do {
			System.out.println("Digite um valor N (Maior que 0): ");
			N = input.nextInt();
			
			if (N <= 0) {
				System.out.println(" O valor de N deve ser maior que 0. Tente novamente.");
			}
		}while (N <= 0);
		
		System.out.println("Valores inteiros entre 1 e " + N + ":");
		for (int i = 1; i <= N; i++) {
			System.out.println(i);
		}
		
		input.close();
		
	}

}
