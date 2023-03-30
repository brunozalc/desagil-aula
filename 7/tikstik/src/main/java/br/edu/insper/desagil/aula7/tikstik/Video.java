package br.edu.insper.desagil.aula7.tikstik;

import java.util.HashMap;
import java.util.Map;

public class Video {
    public Produto produto;

    public Map<String, Integer> avaliacoes;

    public Video(Produto produto) {
        this.produto = produto;
        this.avaliacoes = new HashMap<>();
    }

    public Produto getProduto() {
        return produto;
    }

    public void adicionaAvaliacao(Usuario usuario, Integer avaliacao) {
        this.avaliacoes.put(usuario.getNome(), avaliacao);
    }

    public int mediaAvaliacoes() {
        if (avaliacoes.size() == 0) {
            return 0;
        }
        double soma = 0;
        for (int avaliacao : avaliacoes.values()) {
            soma += avaliacao;
        }
        return (int) Math.round(soma / avaliacoes.size());
    }
    
}
