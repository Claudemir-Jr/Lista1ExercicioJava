package listaDeExercicio1;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double a;
		double b;
		double c;
		double maior;

        System.out.print("Digite o primeiro valor: ");
        a = input.nextDouble();

        System.out.print("Digite o segundo valor: ");
        b = input.nextDouble();

        System.out.print("Digite o terceiro valor: ");
        c = input.nextDouble();

        // Encontrar o maior valor
        maior = Math.max(a, Math.max(b, c));

        // Encontrar o segundo maior valor
        double segundoMaior;
        
        
        if (maior == a) {
            segundoMaior = Math.max(b, c);
        } else if (maior == b) {
            segundoMaior = Math.max(a, c);
        } else {
            segundoMaior = Math.max(a, b);
            
        }

        input.close();
        
        // Calcular e imprimir a soma dos 2 maiores valores
        double somaDosMaiores = maior + segundoMaior;
        System.out.println("A soma dos 2 maiores valores é: " + somaDosMaiores);
    }
	
	//Math.max() para encontrar o maior valor entre eles. Depois,
	//utilizando estruturas condicionais, determinamos o segundo maior valor. 
	//Finalmente, calculamos e imprimimos a soma dos dois maiores valores.
}