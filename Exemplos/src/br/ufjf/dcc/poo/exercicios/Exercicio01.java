//CALCULA ÁREA DO RETÂNGULO
package br.ufjf.dcc.poo.exercicios;
import java.util.Scanner;

class Exercicio01 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in); // Leitor Teclado

		int altura, base; //Dados de Entrada

		float area;

		System.out.println("Informe a altura: ");

		altura = teclado.nextInt();

		System.out.println("Informe a base: ");

		base = teclado.nextInt();

		area = 0.5f * altura * base;

		System.out.println("A área é: " + area);

	}
}
