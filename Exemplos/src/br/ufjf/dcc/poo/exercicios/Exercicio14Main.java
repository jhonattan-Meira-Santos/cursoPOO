package br.ufjf.dcc.poo.exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio14Main {

	public static void main(String[] args) {
		ArrayList<Exercicio14Conta> conta = new ArrayList<Exercicio14Conta>();
		
		Scanner teclado = new Scanner(System.in);
		Exercicio14Conta p = new Exercicio14Conta();
		System.out.println("Digite o nome do titutar:");
		p.setNomeTitular(teclado.nextLine());
		System.out.println("Digite a agência");
		p.setAgencia(teclado.nextLine());
		System.out.println("Digite o número da conta: ");
		p.setNumero(Integer.parseInt(teclado.nextLine()));
		System.out.println("Digite a data");
		p.setData(teclado.nextLine());
		System.out.println("Digite a agencia");
		p.setAgencia(teclado.nextLine());
		
		p.deposita(11);
		p.saca(10);
		System.out.println("Rendimento: " + p.calculaRendimento());
		
		conta.add(p);
	}

}
