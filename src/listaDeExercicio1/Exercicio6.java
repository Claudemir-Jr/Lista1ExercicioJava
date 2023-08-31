package listaDeExercicio1;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int valor1,valor2;
		
		System.out.println("Digite o primeiro valor: ");
		valor1 = input.nextInt();
		System.out.println("Digite o primeiro valor: ");
		valor2 = input.nextInt();
		
		if(valor1 > valor2) {
			System.out.println("O maior valor é " + valor1);
			
		}if(valor1 == valor2) {
			System.out.println("digite outro valor diferente ");
		}else {
			System.out.println("O maior valor é " + valor2);
		}
		
		input.close();
	}

}
