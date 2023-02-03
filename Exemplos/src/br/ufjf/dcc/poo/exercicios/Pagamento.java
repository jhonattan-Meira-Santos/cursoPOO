package br.ufjf.dcc.poo.exercicios;

import java.util.Date;

public class Pagamento {
	private String numBanco;
	private Date data;
	
	private Boleto boleto;

	public String getNumBanco() {
		return numBanco;
	}

	public void setNumBanco(String numBanco) {
		this.numBanco = numBanco;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Boleto getBoleto() {
		return boleto;
	}

	public void setBoleto(Boleto boleto) {
		this.boleto = boleto;
	}
	
	
}
