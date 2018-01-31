package br.com.algaworks.Modulo5.Desafio22;

public class Pessoa {
	private String nome;
	
	Pessoa(){ }
	Pessoa(String nome){
		this.setNome(nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
