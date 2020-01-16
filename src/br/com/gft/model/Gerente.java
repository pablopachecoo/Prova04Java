package br.com.gft.model;

public class Gerente extends Funcionario {
	
	
	public Gerente(String nome, int idade, int salario) {
		super(nome, idade, salario);
		// TODO Auto-generated constructor stub
	}

	public int bonificacao() {
		return salario +10000;
	}

}
