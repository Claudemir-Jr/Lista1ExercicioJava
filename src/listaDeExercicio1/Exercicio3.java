package listaDeExercicio1;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int qtdmaca;
		double valor1 = 1.30;
		double valor = 1.00;
		
		System.out.println("Quantas maçãs você vai comprar?");
		qtdmaca = input.nextInt();
		
		
			if (qtdmaca >= 12) {
				System.out.println("Quantidade de maçãs compradas foram: " + qtdmaca);
				System.out.println("O valor unitario dela é: R$" + valor);
				System.out.println("o Total foi de: R$ " + qtdmaca * valor);
			}else {
				System.out.println("Quantidade de maçãs compradas foram: " + qtdmaca);
				System.out.println("O valor unitario dela é: R$" + valor1);
				System.out.println("o Total foi de: R$ " + qtdmaca * valor1);
			}
		input.close();
	}

}
