package br.ufjf.dcc.poo.exercicios;

import java.util.ArrayList;

public class Socio {
	private int matricula;
	private String nome;
	private ArrayList<Boleto> boleto;
	private CartaoAcesso cartaoAcesso;
	private ArrayList<Veiculo> veiculo;
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ArrayList<Boleto> getBoleto() {
		return boleto;
	}
	public void setBoleto(ArrayList<Boleto> boleto) {
		this.boleto = boleto;
	}
	public CartaoAcesso getCartaoAcesso() {
		return cartaoAcesso;
	}
	public void setCartaoAcesso(CartaoAcesso cartaoAcesso) {
		this.cartaoAcesso = cartaoAcesso;
	}
	public ArrayList<Veiculo> getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(ArrayList<Veiculo> veiculo) {
		this.veiculo = veiculo;
	}
}
