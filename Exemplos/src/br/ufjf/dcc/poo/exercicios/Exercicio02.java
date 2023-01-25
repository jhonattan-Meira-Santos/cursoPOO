//CALCULA A ÁREA RESTANTE DO TERRENO
package br.ufjf.dcc.poo.exercicios;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		float medidaMaiorTerreno, medidaMenorTerreno, medidaMaiorCasa,medidaMenorCasa;
		float areaTerreno, areaCasa, areaSobra;
		
		System.out.println("Informe a maior medida do terreno: ");

		medidaMaiorTerreno = teclado.nextFloat();
		
		System.out.println("Informe a menor medida do terreno: ");
		medidaMenorTerreno = teclado.nextFloat();
		
		System.out.println("Informe a maior medida da casa: ");
		medidaMaiorCasa = teclado.nextFloat();
		
		System.out.println("Informe a menor medida da casa: ");
		medidaMenorCasa = teclado.nextFloat();
		
		areaTerreno = medidaMaiorTerreno * medidaMenorTerreno;
		areaCasa = medidaMaiorCasa * medidaMenorCasa;
		
		areaSobra = areaTerreno - areaCasa;
		
		System.out.println("AREA: " + (areaSobra/areaTerreno) * 100 + "%");
		
		
		
		
		
		
	}

}
