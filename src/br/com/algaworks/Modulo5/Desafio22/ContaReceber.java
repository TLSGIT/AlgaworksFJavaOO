package br.com.algaworks.Modulo5.Desafio22;

public class ContaReceber extends Conta{

		Cliente cliente = new Cliente();
		
		ContaReceber() {}
		ContaReceber(Cliente cliente, String descricao, double valor, String dataVencimento){
			this.setCliente(cliente);
			this.setDescricao(descricao);
			this.setValor(valor);
			this.setDataVencimento(dataVencimento);
		}
		
		void receber() {
			System.out.println("Recebendo conta... Recebido!");
			return;
		}
		
		void cancelar(double valor) {
			
			if(valor > 50000) { 
				System.out.println("Erro! Conta acima de 50k.");
				return; }
			
			if(getSituacaoConta() == SituacaoConta.CANCELADA || 
					getSituacaoConta() == SituacaoConta.PAGA) {
				System.out.println("Impossível cancelar uma conta "
						+ "já cancelada ou paga anteriormente!");
				return;
			}
			System.out.println("Cancelando conta... Cancelada!");
			setSituacaoConta(SituacaoConta.CANCELADA);
			
		}
		public Cliente getCliente() {
			return cliente;
		}
		public void setCliente(Cliente cliente) {
			this.cliente = cliente;
		}
		
		@Override
		public void exibirDetalhes() {
			System.out.println(" --------------------------------------------------------");
			System.out.println("Este é o relatório desta Conta:");
			System.out.println("Com data de vencimento para: " + this.getDataVencimento() + 
					"\n" + "Com descrição: " + this.getDescricao() + "\n" +
					"Com valor de: " + this.getValor() + 
					"\n" + "Com situação de conta: "+ this.getSituacaoConta() +
					"\n" + "Com nome do Cliente: " + this.cliente.getNome());
			System.out.println(" --------------------------------------------------------");
			
		}
		
}
