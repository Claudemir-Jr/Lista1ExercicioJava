package listaDeExercicio1;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

        System.out.print("Número da conta do cliente: ");
        int numeroConta = input.nextInt();

        System.out.print("Saldo: ");
        double saldo = input.nextDouble();

        System.out.print("Débito: ");
        double debito = input.nextDouble();

        System.out.print("Crédito: ");
        double credito = input.nextDouble();

        double saldoAtual = saldo - debito + credito;
        
        System.out.println("Na sua conta " + numeroConta + " tem os seguintes valores");

        System.out.println("Saldo atual: " + saldoAtual);

        if (saldoAtual >= 0) {
            System.out.println("Saldo Positivo");
        } else {
            System.out.println("Saldo Negativo");
        }
        input.close(); 
    }

}
