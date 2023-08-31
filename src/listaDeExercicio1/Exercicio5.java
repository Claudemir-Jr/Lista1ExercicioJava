package listaDeExercicio1;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
	int anoAtual;
	int anoDeNascimento;
	int idade;
	
	System.out.println("Em que ano estamos?");
	anoAtual = input.nextInt();
	System.out.println("Qual o ano que você nasceu? ");
	anoDeNascimento = input.nextInt();
	
	idade = anoAtual - anoDeNascimento;
	
	System.out.println("Sua idade é " + idade);
	
	if(idade >= 16) {
		System.out.println("Você poderá votar esse ano");
	}else {
		System.out.println("Você não poderá votar esse anof");
	}
	
	input.close();

	}

}
