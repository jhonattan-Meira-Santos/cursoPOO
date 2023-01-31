package br.ufjf.dcc.poo.exercicios;

public class Exercicio13Aluno {
	private String matricula, nome;
	private float nota1,nota2, trabalho;
	
	public float getTrabalho() {
		return trabalho;
	}
	
	public void setTrabalho(float trabalho) {
		this.trabalho = trabalho;
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setNota(float nota1, float nota2) {
		this.nota1 = nota1;
		this.nota2 = nota2;
	}
	
	private float getMedia() {
		float media = (float) (this.nota1 + this.nota2 + this.trabalho) / 3;
		return media;
	}
	
	public void resultadoFinal() {
		float nota = this.getMedia();
		if(nota >= 4 && nota < 6)
		{
			System.out.println("Prova Final");
		}else if(nota>6) {
			System.out.println("Aprovado");
		}else {
			System.out.println("Reprovado");
		}
	}
	
}
