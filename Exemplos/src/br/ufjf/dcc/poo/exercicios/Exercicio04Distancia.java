package br.ufjf.dcc.poo.exercicios;

import javax.swing.JOptionPane;

public class Exercicio04Distancia {
	public static void main(String[] args) {
		String num;
		double x1,x2,y1,y2,distancia;
		
		num = JOptionPane.showInputDialog(null,"Digite o primeiro valor de x", "Titulo",JOptionPane.INFORMATION_MESSAGE);
		x1 = Double.parseDouble(num);
		num = JOptionPane.showInputDialog(null,"Digite o segundo valor de x");
		x2 = Double.parseDouble(num);
		num = JOptionPane.showInputDialog(null,"Digite o primeiro valor de y", "Titulo",JOptionPane.INFORMATION_MESSAGE);
		y1 = Double.parseDouble(num);
		num = JOptionPane.showInputDialog(null,"Digite o segundo valor de y");
		y2 = Double.parseDouble(num);
		
		distancia = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
 		JOptionPane.showMessageDialog(null, distancia);
	}
}
