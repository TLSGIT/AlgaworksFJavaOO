package br.com.algaworks.Modulo5.Desafio13;

public class Fornecedor {
	private String nome;

	Fornecedor(){
		
	}
	
	Fornecedor(String nome){
		setNome(nome);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
