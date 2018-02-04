package br.com.algaworks.Modulo6.Desafio3;

import java.util.Scanner;

public class SimuladorJogosSena {

	public static void main(String[] args) {
		System.out.println("Digite a quantidade de jogos:");
		Scanner sc = new Scanner(System.in);
		int choiseNumGames = sc.nextInt();
		sc.close();
		
		int[][] jogosGeradosPeloSistema = geradorDeJogosCEFSena(choiseNumGames);
		
		//System.out.println("Tam Linhas: " + jogosGeradosPeloSistema.length);
		//System.out.println("Tam Colunas: " + jogosGeradosPeloSistema[1].length);
		
		for(int linha=0; linha<jogosGeradosPeloSistema.length; linha++) {
			System.out.print("Jogo " + linha + " [ ");
			for(int coluna=0; coluna<jogosGeradosPeloSistema[1].length; coluna++) {
				System.out.print(jogosGeradosPeloSistema[linha][coluna] +  " ");
			}
			System.out.println("]");
		}

	}
	
	public static int[][] geradorDeJogosCEFSena(int numJogos) {
		int[][] vetorJogosGerados = new int[numJogos][6];

		for(int linha=0; linha<numJogos; linha++) {
			for(int coluna=0; coluna<6; coluna++) {
				vetorJogosGerados[linha][coluna] = (int) (Math.random()*60);
			}
		}
		
		return vetorJogosGerados;
	}

}
