package br.ufjf.dcc.poo.exercicios;

public class Exercicio12Pessoa {
	
	private String nome;
	private int idade;
	private String sexo;
	
	//Tipos de Construtores
	public Exercicio12Pessoa(String nome, int idade, String sexo) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Exercicio12Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public Exercicio12Pessoa() {
		
	}
}
