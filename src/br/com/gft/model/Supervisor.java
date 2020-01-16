package br.com.gft.model;

public class Supervisor extends Funcionario {

	public Supervisor(String nome, int idade, int salario) {
		super(nome, idade, salario);
		// TODO Auto-generated constructor stub
	}

	public int bonificacao() {
		return salario + 5000;
	}

}
