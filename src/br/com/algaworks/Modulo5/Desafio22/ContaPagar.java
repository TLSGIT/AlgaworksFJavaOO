package br.com.algaworks.Modulo5.Desafio22;

public class ContaPagar extends Conta{
	
	Fornecedor fornecedor = new Fornecedor();
	
	ContaPagar(){
		setSituacaoConta(SituacaoConta.PENDENTE);
	}
	
	ContaPagar(Fornecedor fornecedor, String descricao, double valor, String dataVencimento){
		setDescricao(descricao);
		setDataVencimento(dataVencimento);
		setValor(valor);
		setFornecedor(fornecedor);
		setSituacaoConta(SituacaoConta.PENDENTE);
			}
	
	
	 void pagar(){
		if( getSituacaoConta() == SituacaoConta.PENDENTE) {
			System.out.println(" Pagando...\n Descrição da conta: " + getDescricao() + 
					"\n Valor: " + getValor() + 
					"\n Data de Vencimento: " + getDataVencimento() +
					"\n Nome do Fornecedor: " + this.fornecedor.getNome() + "\n");
			setSituacaoConta(SituacaoConta.PAGA);
			return;
		}
		System.out.println(" Erro! Conta já paga ou cancelada!");	
	}


	public Fornecedor getFornecedor() {
		return fornecedor;
	}


	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	@Override
	public void exibirDetalhes() {
		System.out.println(" --------------------------------------------------------");
		System.out.println("Este é o relatório desta Conta:");
		System.out.println("Com data de vencimento para: " + this.getDataVencimento() + 
				"\n" + "Com descrição: " + this.getDescricao() + "\n" +
				"Com valor de: " + this.getValor() + 
				"\n" + "Com nome de fornecedor: " + this.fornecedor.getNome() + 
				"\n" + "Com situação de conta: "+ this.getSituacaoConta());
		System.out.println(" --------------------------------------------------------");
	}
	

	
	


}
