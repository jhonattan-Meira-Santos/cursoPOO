package br.ufjf.dcc.poo.exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio12Main {

	public static void main(String[] args) {
		Exercicio12Pessoa p1 = new Exercicio12Pessoa("João",35);
		Exercicio12Pessoa p2 = new Exercicio12Pessoa("Ana",25,"F");
		Exercicio12Pessoa p3 = new Exercicio12Pessoa();
		
		ArrayList<Exercicio12Pessoa> pessoas = new ArrayList<Exercicio12Pessoa>();
		
		Scanner teclado = new Scanner(System.in);
		
		for(int i = 0; i<3;i++)
		{
			Exercicio12Pessoa p = new Exercicio12Pessoa();
			System.out.println("Digite o nome da pessoa: ");
			p.setNome(teclado.nextLine());
			System.out.println("Digite a idade da pessoa: ");
			p.setIdade(Integer.parseInt(teclado.nextLine()));
			System.out.println("Digite o sexo da pessoa: ");
			p.setSexo(teclado.nextLine());
			pessoas.add(p);
		}
		
		for(Exercicio12Pessoa p :pessoas) {
			System.out.println("O nome da pessoa é: "+ p.getNome());
			System.out.println("A idade da pessoa é: "+ p.getIdade());
			System.out.println("O sexo da pessoa é: "+ p.getSexo());
		}
	
	}

}
