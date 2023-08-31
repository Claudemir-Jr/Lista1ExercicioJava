package listaDeExercicio1;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int primeiroValor = input.nextInt();

        System.out.print("Digite o segundo valor: ");
        int segundoValor = input.nextInt();

        if (primeiroValor == segundoValor) {
            System.out.println("Números iguais");
        } else {
            if (primeiroValor > segundoValor) {
                System.out.println("Primeiro valor é maior");
            } else {
                System.out.println("Segundo valor é maior");
            }
        }
        
        input.close();
    }
}
