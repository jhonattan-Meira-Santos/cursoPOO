package br.ufjf.dcc.poo.exercicios;

import java.util.Scanner;

public class Exercicio10Intervalo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int valorInicial,valorFinal; //Dados de Entrada
		valorInicial = teclado.nextInt();
		valorFinal = teclado.nextInt();
		
		for(valorInicial++; valorInicial < valorFinal;valorInicial++ ) {
			System.out.println(valorInicial);
		}
		
		
	}

}
