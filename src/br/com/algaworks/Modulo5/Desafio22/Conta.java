package br.com.algaworks.Modulo5.Desafio22;

public class Conta {
	private String descricao, dataVencimento;
	private double valor;
	private SituacaoConta situacaoConta;
	
	Conta(){
		situacaoConta = SituacaoConta.PENDENTE;
	}
	
	void cancelar() {
		if(this.situacaoConta == SituacaoConta.CANCELADA || 
				this.situacaoConta == SituacaoConta.PAGA) {
			System.out.println("Impossível cancelar uma conta "
					+ "já cancelada ou paga anteriormente!");
			return;
		}
		System.out.println("Cancelando conta... Cancelada!");
		this.situacaoConta = SituacaoConta.CANCELADA;
	}
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public SituacaoConta getSituacaoConta() {
		return situacaoConta;
	}

	public void setSituacaoConta(SituacaoConta situacaoConta) {
		this.situacaoConta = situacaoConta;
	}
	
	
}
