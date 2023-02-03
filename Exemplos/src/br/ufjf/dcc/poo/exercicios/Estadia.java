package br.ufjf.dcc.poo.exercicios;

import java.util.Date;

public class Estadia {
	private Date dataHoraEntrada;
	private Date dataHoraSaida;
	private double valor;
	private Veiculo veiculo;
	
	public Date getDataHoraEntrada() {
		return dataHoraEntrada;
	}
	public void setDataHoraEntrada(Date dataHoraEntrada) {
		this.dataHoraEntrada = dataHoraEntrada;
	}
	public Date getDataHoraSaida() {
		return dataHoraSaida;
	}
	public void setDataHoraSaida(Date dataHoraSaida) {
		this.dataHoraSaida = dataHoraSaida;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Veiculo getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
}
