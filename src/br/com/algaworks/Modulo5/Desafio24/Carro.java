package br.com.algaworks.Modulo5.Desafio24;

public class Carro implements Seguravel {

	private double valorMercado;
	private int anoFabricacao;
	
	/** Personalized constructor */
	public Carro(double valorMercado, int anoFabricacao) {
		this.setAnoFabricacao(anoFabricacao);
		this.setValorMercado(valorMercado);
	}
	
	/** Pattern constructor */
	public Carro() {} 
	
	@Override
	public double calcularValorApolice() {
		// cálculos fictícios do valor de uma apólice de um carro
		double valorApolice = this.getValorMercado() * 0.04;
		if (anoFabricacao < 2000) {
		valorApolice = valorApolice * 0.90;
		}
		return valorApolice;
	}

	@Override
	public String obterDescricao() {
		return "Carro ano " + this.getAnoFabricacao() + " com valor de mercado "
				+ this.getValorMercado();
	}

	
	/** 
	 * Access encasulated in Getters and Setters Methods */
	public double getValorMercado() {
		return valorMercado;
	}
	public void setValorMercado(double valorMercado) {
		this.valorMercado = valorMercado;
	}
	public int getAnoFabricacao() {
		return anoFabricacao;
	}
	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
}
