package br.com.algaworks.Modulo5.Desafio07;

public class ContaPagar {
	


	private String descricao, dataVencimento;
	private double valor;
	
	Fornecedor fornecedor = new Fornecedor();
	
	ContaPagar(){
		
	}
	
	ContaPagar(Fornecedor fornecedor, String descricao, double valor, String dataVencimento){
		setDescricao(descricao);
		setDataVencimento(dataVencimento);
		setValor(valor);
		setFornecedor(fornecedor);
			}
	
	
	void pagar(){
		System.out.println(" Descrição da conta: " + getDescricao() + 
				"\n Valor: " + getValor() + 
				"\n Data de Vencimento: " + getDataVencimento() +
				"\n Nome do Fornecedor: " + this.fornecedor.getNome() + "\n");
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
}
