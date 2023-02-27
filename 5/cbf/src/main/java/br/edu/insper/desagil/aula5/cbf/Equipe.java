package br.edu.insper.desagil.aula5.cbf;

import java.util.HashMap;
import java.util.Map;

public class Equipe {
	private String nome;
	private Map<Integer, Jogador> jogadores;

	public Equipe(String nome) {
		this.nome = nome;
		this.jogadores = new HashMap<>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Jogador acessaJogador(int camisa) {
		return jogadores.get(camisa);
	}

	public void adicionaJogador(int camisa, Jogador jogador) {
		jogadores.put(camisa, jogador);
	}
}
