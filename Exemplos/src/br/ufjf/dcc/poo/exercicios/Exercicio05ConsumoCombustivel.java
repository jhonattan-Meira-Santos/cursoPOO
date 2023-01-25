package br.ufjf.dcc.poo.exercicios;

import javax.swing.JOptionPane;

public class Exercicio05ConsumoCombustivel {
	public static void main(String[] args) {
		String num;
		int quilometros, tanqueCheio, consumoKmPorLitro;

		num = JOptionPane.showInputDialog(null,"Digite a quilometragem", "Titulo",JOptionPane.INFORMATION_MESSAGE);
		quilometros = Integer.parseInt(num);
		
		num = JOptionPane.showInputDialog(null,"Digite a quilometragem", "Titulo",JOptionPane.INFORMATION_MESSAGE);
		tanqueCheio = Integer.parseInt(num);
		
		consumoKmPorLitro = quilometros/tanqueCheio;
		JOptionPane.showMessageDialog(null, consumoKmPorLitro);
	}
}
