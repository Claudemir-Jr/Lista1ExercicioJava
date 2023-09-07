package ListaDeExercicio2;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
Scanner input = new Scanner (System.in);
		
		double notaAvaliacao1, notaAvaliacao2;
		double media;
		String resposta1;
		
		
		do {
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
				
				
			if (media < 7) {
				System.out.println("Reprovado!");
			}else {
				System.out.println("Aprovado!");
			}
			
			
				System.out.println("Novo Cálculo? Digite S para 'SIM' e N para 'NÃO' ");
				input.nextLine();
				resposta1 = input.nextLine();
				
				
				if( resposta1.equals("S")) {
					System.out.println("Ok, vamos do início :D");
					
				}else if (resposta1.equals("N")) {
					System.out.println("Obrigado por utilizar");
					break;
				} else {
					System.out.println("Resposta inválida! O programa será encerrado.");
					break;
				}
			
			} while (resposta1.equals("S"));
		
		input.close();
	}

}