package listaDeExercicio1;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double primeiraNota,segundaNota, media;
		
		System.out.println("Digite a sua primeira nota: ");
		primeiraNota = input.nextDouble();
		System.out.println("Digite sua Segunda nota");
		segundaNota = input.nextDouble();
		
		
		media = (primeiraNota + segundaNota)/ 2;
		
		System.out.println("Sua media é: " + media);
		
		if(media >= 6) {
			System.out.println("Aprovado!");
		}else {
			System.out.println("Reprovado");
		}
		input.close();
	}

}
