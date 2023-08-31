package listaDeExercicio1;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double valor;

        System.out.print("Digite um valor: ");
        valor = input.nextDouble();

        if (valor > 0) {
            System.out.println("O valor é positivo.");
        } else if (valor < 0) {
            System.out.println("O valor é negativo.");
        } else {
            System.out.println("O valor é zero.");
        }
        input.close();
    }
}