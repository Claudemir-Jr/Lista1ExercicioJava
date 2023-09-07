package ListaDeExercicio2;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		double notaAvaliacao1, notaAvaliacao2;
		double media;
		
		System.out.print("Digite a nota da sua primeira avaliação: ");
		notaAvaliacao1 = input.nextDouble();

		System.out.print("Digite a nota da sua segunda avaliação: ");
		notaAvaliacao2 = input.nextDouble();
		
		
		while (notaAvaliacao1 < 0 || notaAvaliacao2 > 10) {
			
			System.out.println("digite as notas corretas!!");
			
			System.out.print("Digite novamente a primeira nota da sua avaliação: ");
			notaAvaliacao1 = input.nextDouble();
			
			System.out.print("Digite novamente a segunda nota da sua avaliação: ");
			notaAvaliacao2 = input.nextDouble();
			
		}
	
			media = (notaAvaliacao1 + notaAvaliacao2) / 2;
			
				System.out.println("Sua media é: " + media);
				
				input.close();

	}

}
