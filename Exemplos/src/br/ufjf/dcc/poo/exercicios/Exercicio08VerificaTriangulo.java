package br.ufjf.dcc.poo.exercicios;

import java.util.Scanner;

public class Exercicio08VerificaTriangulo {

	public static void main(String[] args) {
		int ladoA,ladoB,ladoC;
		
		Scanner teclado = new Scanner(System.in); // Leitor Teclado
		
		System.out.println("Informe o lado A: ");
		ladoA = teclado.nextInt();
		
		System.out.println("Informe o lado B: ");
		ladoB = teclado.nextInt();
		
		System.out.println("Informe o lado C: ");
		ladoC = teclado.nextInt();
		
		if(ladoA > Math.abs(ladoB - ladoC) && ladoA < ladoB + ladoC 
				&& ladoB > Math.abs(ladoA - ladoC) && ladoB < ladoA + ladoC
				&& ladoC > Math.abs(ladoA - ladoB) && ladoC < ladoA + ladoB)
		{
			System.out.println("É um triângulo");
		}else {
			System.out.println("Não existe");
		}
		
		

		
		
	}

}
