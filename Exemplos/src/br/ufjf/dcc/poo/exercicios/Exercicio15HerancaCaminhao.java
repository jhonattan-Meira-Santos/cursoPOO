package br.ufjf.dcc.poo.exercicios;

public class Exercicio15HerancaCaminhao extends Exercicio15HerancaVeiculo{
	private float tara;
	@Override
	public double calcularConsumo(double precoLitro) {
		return ((this.getCapacidadeTanque() / this.getKmRodados()) *precoLitro) / this.tara;
	}

	public float getTara() {
		return tara;
	}

	public void setTara(float tara) {
		this.tara = tara;
	}
}
