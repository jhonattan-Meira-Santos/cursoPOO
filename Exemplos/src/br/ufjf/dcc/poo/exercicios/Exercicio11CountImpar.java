package br.ufjf.dcc.poo.exercicios;

import java.util.Scanner;

public class Exercicio11CountImpar {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int valor = 0,totalImpar=0; //Dados de Entrada

		while(valor != -1)
		{
			System.out.println("Informe um valor inteiro ou -1 para sair: ");
			valor = teclado.nextInt();
			if(valor  % 2 != 0 && valor != -1)
			{
				totalImpar++;
			}
		}	
		
		System.out.println("O total de números impares foi: " + totalImpar);
	}
}
