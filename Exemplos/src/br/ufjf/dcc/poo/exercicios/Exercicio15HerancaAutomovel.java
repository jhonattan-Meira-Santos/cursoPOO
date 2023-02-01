package br.ufjf.dcc.poo.exercicios;

public class Exercicio15HerancaAutomovel extends Exercicio15HerancaVeiculo {
	@Override
	public double calcularConsumo(double precoLitro) {
		return (this.getCapacidadeTanque() / this.getKmRodados()) *precoLitro;
	}
	
}
