package br.ufjf.dcc.poo.exercicios;

public class Exercicio14Conta {
	private String nomeTitular;
	private int numero;
	private String agencia;
	private double saldo;
	private String data;
	public String getNomeTitular() {
		return nomeTitular;
	}
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	public void saca(float valor) {
		if(this.getSaldo() >= valor) {
			this.saldo -= valor;
		}
	}
	
	public void deposita(float valor) {
		this.saldo += valor;
	}
	
	public double calculaRendimento() {
		return this.saldo * 0.10;
	}
}
