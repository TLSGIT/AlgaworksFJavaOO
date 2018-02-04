package br.com.algaworks.Modulo5.Desafio24;

public class Imovel implements Seguravel {

	private double valorMercado;
	private int areaConstruida;
	
	public Imovel(double valorMercado, int areaConstruida){
		this.setValorMercado(valorMercado);
		this.setAreaConstruida(areaConstruida);
	}

	@Override
	public double calcularValorApolice() {
		// cálculos fictícios do valor de uma apólice de um imóvel
		double valorApolice = this.getValorMercado() * 0.003;
		valorApolice = valorApolice + (areaConstruida * 0.5);
		return valorApolice;
	}

	@Override
	public String obterDescricao() {
		return "Imóvel com área construída de " + this.getAreaConstruida() + "m2 e valor de mercado " +
				this.getValorMercado();
	}

	public double getValorMercado() {
		return valorMercado;
	}
	
	public void setValorMercado(double valorMercado) {
		this.valorMercado = valorMercado;
	}
	
	public int getAreaConstruida() {
		return areaConstruida;
	}
	
	public void setAreaConstruida(int areaConstruida) {
		this.areaConstruida = areaConstruida;
	}
	
	
}
