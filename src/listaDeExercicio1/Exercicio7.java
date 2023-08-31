package listaDeExercicio1;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
	      
	        Scanner input = new Scanner(System.in);
	        
	        int valor1, valor2;

	        System.out.print("Digite o primeiro valor: ");
	        valor1 = input.nextInt();

	        System.out.print("Digite o primeiro valor: ");
	        valor2 = input.nextInt();

	        if(valor1 < valor2){
	            System.out.println("Os números para ordem crescente são: \n" + valor1 + "\n" + valor2);
	        }else if(valor2 < valor1){
	            System.out.println("Os números para ordem crescente são: \n" + valor2 + "\n" + valor1);
	      }
	        
	        input.close();

	  }

}
