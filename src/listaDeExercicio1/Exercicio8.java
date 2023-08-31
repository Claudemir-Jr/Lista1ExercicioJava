package listaDeExercicio1;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
			
	        int horarioInicio; 
	        int horarioFim; 
	        int duracaoPartida;

	        System.out.print("Digite o horário que a partida começou: ");
	        horarioInicio = input.nextInt();

	        System.out.print("Digite o horário que a partida terminou: ");
	        horarioFim = input.nextInt();

	        duracaoPartida = horarioFim - horarioInicio;

	        if (duracaoPartida > 24){
	            System.out.println("uma partida não pode durar mais de 24 horas");
	        }else{
	            System.out.print("A partida durou " + duracaoPartida + " horas");
	        }
	        input.close();
	    }

	}
