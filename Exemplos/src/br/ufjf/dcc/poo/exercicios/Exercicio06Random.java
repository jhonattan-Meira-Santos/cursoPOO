package br.ufjf.dcc.poo.exercicios;

import javax.swing.JOptionPane;

public class Exercicio06Random {

	public static void main(String[] args) {
		int numeroSorteado = (int) (Math.random() * 100);
		String num;
		int valorUsuario;
		num = JOptionPane.showInputDialog(null,"Digite um valor", "Titulo",JOptionPane.INFORMATION_MESSAGE);
		valorUsuario = Integer.parseInt(num);
		if(valorUsuario > numeroSorteado)
			JOptionPane.showMessageDialog(null, "O valor sorteado é menor");
		else if(valorUsuario < numeroSorteado)
			JOptionPane.showMessageDialog(null, "O valor sorteado é maior");
		else
			JOptionPane.showMessageDialog(null, "Você é o cara!");
	}

}
