package br.ufjf.dcc.poo.exercicios;

public abstract class Exercicio15HerancaVeiculo {
	private String marca;
	private int capacidadeTanque;
	private float kmRodados;
	
	public double calcularConsumo(double precoLitro) {
		return 0;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getCapacidadeTanque() {
		return capacidadeTanque;
	}

	public void setCapacidadeTanque(int capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}

	public float getKmRodados() {
		return kmRodados;
	}

	public void setKmRodados(float kmRodados) {
		this.kmRodados = kmRodados;
	}
}
