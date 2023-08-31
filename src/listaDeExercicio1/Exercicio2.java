package listaDeExercicio1;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	
	int numero = 0;
		System.out.println("Digite um número: ");
		numero = input.nextInt();
		
		if( numero >= 0) {
			System.out.println("O número é positivo");
		}else {
			System.out.println("O número é negativo");
		}
		input.close();
	}

}
