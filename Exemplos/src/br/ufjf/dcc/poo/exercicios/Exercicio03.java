//CALCULA OS COEFICIENTES DE UMA FUNÇÃO DE SEGUNDO GRAU
package br.ufjf.dcc.poo.exercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		int a,b,c;
		double delta,raizDelta, coeficienteA = 0, coeficienteB = 0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o valor de A: ");
		a = teclado.nextInt();
		
		System.out.println("Informe o valor de B: ");
		b = teclado.nextInt();

		System.out.println("Informe o valor de C: ");
		c = teclado.nextInt();
		
		delta = b * b - 4 * a * c;
		if(delta < 0 )
		{
			delta *= -1;
		}
		
		raizDelta = Math.sqrt(delta);
		if(raizDelta > 0)
		{
			coeficienteA = (-1 * b + raizDelta) / (2 * a);
			coeficienteB = (-1 * b - raizDelta) / (2 * a);
		}

		System.out.println("A: "+ coeficienteA);
		System.out.println("B: "+ coeficienteB);
		
		
		
		
		
		
		
		

	}

}
