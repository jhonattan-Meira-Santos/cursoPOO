package br.ufjf.dcc.poo.exercicios;

import javax.swing.JOptionPane;

public class Exercicio07Idade {

	public static void main(String[] args) {
		int idade;
		String num;
		num = JOptionPane.showInputDialog(null,"Digite um valor", "Titulo",JOptionPane.INFORMATION_MESSAGE);
		idade = Integer.parseInt(num);
		if(idade <= 3)
			JOptionPane.showMessageDialog(null, "Bebê");
		else if(idade > 3 && idade <= 13)
			JOptionPane.showMessageDialog(null, "Criança");
		else if(idade > 13 && idade <=20)
			JOptionPane.showMessageDialog(null, "Adolescente");
		else if(idade > 20 && idade <=65)
			JOptionPane.showMessageDialog(null, "Adulto");
		else
			JOptionPane.showMessageDialog(null, "Idoso");
	}

}
