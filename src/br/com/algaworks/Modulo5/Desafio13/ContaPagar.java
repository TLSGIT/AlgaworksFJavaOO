package br.com.algaworks.Modulo5.Desafio13;

public class ContaPagar {
	


	private String descricao, dataVencimento;
	private double valor;
	private SituacaoConta situacaoConta;
	
	Fornecedor fornecedor = new Fornecedor();
	

	ContaPagar(){
		situacaoConta = SituacaoConta.PENDENTE;
	}
	
	ContaPagar(Fornecedor fornecedor, String descricao, double valor, String dataVencimento){
		setDescricao(descricao);
		setDataVencimento(dataVencimento);
		setValor(valor);
		setFornecedor(fornecedor);
		this.situacaoConta = SituacaoConta.PENDENTE;
			}
	
	
	void pagar(){
		if(this.situacaoConta == SituacaoConta.PENDENTE) {
			System.out.println(" Pagando...\n Descrição da conta: " + getDescricao() + 
					"\n Valor: " + getValor() + 
					"\n Data de Vencimento: " + getDataVencimento() +
					"\n Nome do Fornecedor: " + this.fornecedor.getNome() + "\n");
			this.situacaoConta = SituacaoConta.PAGA;
			return;
		}
		System.out.println(" Erro! Conta já paga ou cancelada!");	
	}
	
	void cancelar() {
		if(this.situacaoConta == SituacaoConta.CANCELADA || 
				this.situacaoConta == SituacaoConta.PAGA) {
			System.out.println("Impossível cancelar uma conta "
					+ "já cancelada ou paga anteriormente!");
			return;
		}
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

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	
	public SituacaoConta getSituacaoConta() {
		return situacaoConta;
	}
}
