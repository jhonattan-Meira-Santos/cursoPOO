package br.ufjf.dcc.poo.exemplos;
import java.util.Scanner;

public class CalculaMedia {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in); //Leitor Teclado
		
		float primeiroValor, segundoValor, terceiroValor; //Dados de Entrada
		float media;
		
		System.out.println("Informe o primeiro valor: ");
		primeiroValor = teclado.nextFloat();
		
		System.out.println("Informe o segundo valor: ");
		segundoValor = teclado.nextFloat();
		
		System.out.println("Informe o terceiro valor: ");
		terceiroValor = teclado.nextFloat();	
		
		media = (primeiroValor + segundoValor + terceiroValor) / 3;

		System.out.println("MEDIA:" + media);
		

	}

}
