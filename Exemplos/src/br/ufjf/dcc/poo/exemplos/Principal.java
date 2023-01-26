package br.ufjf.dcc.poo.exemplos;

public class Principal {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();
		Pessoa pessoa3 = new Pessoa();
		
		pessoa1.cpf   = "117.214.333-13";
		pessoa1.idade = 23;
		pessoa1.nome  = "Goku";
		pessoa1.RG    = "MG-1212333";
		pessoa1.sexo  = "M";
		
		pessoa2.cpf   = "009.233.244-23";
		pessoa2.idade = 12;
		pessoa2.nome  = "Naruto";
		
		pessoa3.cpf   = "118.233.244-23";
		
		Funcionario funcionario = new Funcionario();
		
		funcionario.nome = "João";
		funcionario.cargo = "Faxineiro";
		funcionario.matricula = "23333";
		
		Aluno aluno = new Aluno();
		
		aluno.nome = "João";
		aluno.curso = "Exatas";
		aluno.registro = "233655433";
		
		Professor professor = new Professor();
		
		professor.nome = "João";
		professor.numAulas = 20;
		professor.matricula = "24444433655433";

	}

}
