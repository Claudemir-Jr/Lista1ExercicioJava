package listaDeExercicio1;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String time1, time2;
		int quantidadegoltime1, quantidadegoltime2;
		
		System.out.println("Digite o seu primeiro time ");
		time1 = input.nextLine();
		
		System.out.println("Digite o seu segundo time ");
		time2 = input.nextLine();
		
		System.out.println("Quantos gols o " + time1 + " fez?");
		quantidadegoltime1 = input.nextInt();
		
		System.out.println("Quantos gols o " + time2 + " fez?");
		quantidadegoltime2 = input.nextInt();
				
		
		if(quantidadegoltime1 > quantidadegoltime2) {
			System.out.println("o time " + time1 + " ganhou!!!");
			
		}else if(quantidadegoltime2 > quantidadegoltime1){
			System.out.println("o time " +time2 + " ganhou!!!");
		}else {
			System.out.println("EMPATE");
		}
		input.close();
	}

}
