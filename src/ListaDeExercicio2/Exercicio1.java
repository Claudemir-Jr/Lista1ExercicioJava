package ListaDeExercicio2;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int valor1, valor2 = 0;
		
		System.out.print("Digite o primeiro número: ");
		valor1 = input.nextInt();
		
		System.out.print("Digite o segundo número: ");
		valor2 = input.nextInt();
		
		for (int i = 0; valor2 == 0; i++) {
			System.out.print("Digite o segundo número novamente: ");
			valor2 = input.nextInt();
		}
		
		int result = valor1 / valor2;
		
		System.out.println("A divisão entre o primeiro valor e o segundo valor é: " + result);
		
		input.close();
	}
	
}
