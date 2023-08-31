package listaDeExercicio1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
	try (Scanner input = new Scanner(System.in)) {
		int valor;
		
			System.out.println("Digite um valor: ");
			valor = input.nextInt();
			
			if(valor > 10) {
				System.out.println("O valor é maior que 10");
			}else {
				System.out.println("O valor é menor que 10!");
			}
	}
	}
}
