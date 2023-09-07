package ListaDeExercicio2;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int N;
		
		System.out.print("Digite um Valor N: ");
		N = input.nextInt();
		
		if(N > 0) {
			System.out.println("Valores inteiros entre 1 e " + N + ":");
			for (int i = 1; i <= N; i++) {
				System.out.println(i);
			}
		}else {
			System.out.println("Por favor, digite um valor maior que zero.");
		}
		
		input.close();
		
	}

}
