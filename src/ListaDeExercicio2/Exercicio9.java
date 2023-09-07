package ListaDeExercicio2;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int i = 0;
		int contador = 0;
		
		
		for(i = 101; contador < 10; i++) {
			System.out.println("Números: " + i);
			contador++;
		}
		
		input.close();
	}

}
