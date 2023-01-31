package br.ufjf.dcc.poo.exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio13Main {
	public static void main(String[] args) {
		ArrayList<Exercicio13Aluno> aluno = new ArrayList<Exercicio13Aluno>();
		
		Scanner teclado = new Scanner(System.in);
		Exercicio13Aluno p = new Exercicio13Aluno();
		System.out.println("Digite a matricula:");
		p.setMatricula(teclado.nextLine());
		System.out.println("Digite a o nome: ");
		p.setNome(teclado.nextLine());
		System.out.println("Digite as notas das provas: ");
		p.setNota(Float.parseFloat(teclado.nextLine()), Float.parseFloat(teclado.nextLine()));
		System.out.println("Digite as notas do trabalho: ");
		p.setTrabalho(Float.parseFloat(teclado.nextLine()));
		p.resultadoFinal();
		aluno.add(p);
		
		
	}
}
