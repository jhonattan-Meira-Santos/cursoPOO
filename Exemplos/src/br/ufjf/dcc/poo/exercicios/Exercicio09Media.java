package br.ufjf.dcc.poo.exercicios;

import java.util.Scanner;

public class Exercicio09Media {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int valor = 0,quantidade=0,total=0; //Dados de Entrada
		float media;

		while(valor != -1)
		{
			System.out.println("Informe um valor inteiro: ");
			valor = teclado.nextInt();
			quantidade++;
			total += valor;
		}	
		media = total / quantidade;
		System.out.println("A média foi: " + media);
		
	}
}
