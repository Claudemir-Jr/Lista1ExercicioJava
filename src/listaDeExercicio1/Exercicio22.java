package listaDeExercicio1;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        double a = input.nextDouble();

        System.out.print("Digite o valor de B: ");
        double b = input.nextDouble();

        System.out.print("Digite o valor de C: ");
        double c = input.nextDouble();

        if (a < b + c && b < a + c && c < a + b) {
            System.out.println("Formam um triângulo");
        } else {
            System.out.println("Não formam um triângulo");
        }
        input.close();
    }
}
				
				//a = 3, b = 4, c = 5 (Triângulo retângulo)
				//a = 7, b = 10, c = 5 (Triângulo obtusângulo)
				//a = 5, b = 6, c = 7 (Triângulo acutângulo)
				//a = 1, b = 1, c = 1 (Triângulo equilátero)
				//a = 2, b = 3, c = 4 (Triângulo escaleno)

