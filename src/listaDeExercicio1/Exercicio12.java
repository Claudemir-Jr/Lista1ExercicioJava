package listaDeExercicio1;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int quantidadeAtual,quantidadeMaxima,quantidadeMinima;
		double quantidadeMedia;

        System.out.print("Quantidade atual em estoque: ");
        quantidadeAtual = input.nextInt();

        System.out.print("Quantidade máxima em estoque: ");
        quantidadeMaxima = input.nextInt();

        System.out.print("Quantidade mínima em estoque: ");
        quantidadeMinima = input.nextInt();

        quantidadeMedia = (quantidadeMaxima + quantidadeMinima) / 2;

        System.out.println("Quantidade média: " + quantidadeMedia);

        if (quantidadeAtual >= quantidadeMedia) {
            System.out.println("Não efetuar compra");
        } else {
            System.out.println("Efetuar compra");
        }
        input.close();
    }
}
