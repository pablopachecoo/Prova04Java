package br.com.gft.model;

public class Vendedor extends Funcionario {
	
	public Vendedor(String nome, int idade, int salario) {
		super(nome, idade, salario);
		// TODO Auto-generated constructor stub
	}

	public int bonificacao() {
		return salario + 3000;
	}

}
