package br.ufjf.dcc.poo.exemplos;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		String nome[] = new String[3];
		float nota[] = new float[3], soma = 0, media;
		for(int i = 1; i<=3; i++)
		{
			Scanner teclado = new Scanner(System.in);
			
			System.out.println("Digite o nome do "+ i + "º aluno");
			nome[i] = teclado.nextLine();
			
			for(int j = 1; j <= 3 ;j++)
			{
				System.out.println("Digite o a "+j+"º nota do "+ nome[i] + " aluno");
				nota[i] = teclado.nextFloat();
				
				soma += nota[j];
			}	
			
			media = soma/3;
			
			for(int k = 1; k <= 3; k++)
			{
				if(nota[k] >= media)
				{
					System.out.println("Parabéns "+ nome[k]);
				}
			}		
		}
	}

}
