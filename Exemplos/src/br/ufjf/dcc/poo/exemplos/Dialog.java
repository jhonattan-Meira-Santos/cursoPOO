package br.ufjf.dcc.poo.exemplos;

import javax.swing.JOptionPane;

public class Dialog {

	public static void main(String[] args) {
		String num;
		int valor1;
		float valor2;
		
		num = JOptionPane.showInputDialog(null,"Digite o primeiro valor", "Titulo",JOptionPane.INFORMATION_MESSAGE);
		valor1 = Integer.parseInt(num);
		num = JOptionPane.showInputDialog(null,"Digite o segundo valor");
		valor2 = Float.parseFloat(num);
 		JOptionPane.showMessageDialog(null, valor1 + valor2);
	}

}
