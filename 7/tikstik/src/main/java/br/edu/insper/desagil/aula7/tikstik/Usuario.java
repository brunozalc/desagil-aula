package br.edu.insper.desagil.aula7.tikstik;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    String nome;
    List<Video> videos;

    public Usuario(String nome) {
        this.nome = nome;
        this.videos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionaVideo(Video video) {
        videos.add(video);
    }

    public double mediaAvaliacoes() {
        if (videos.isEmpty()) {
            return 0;
        }
        double soma = 0;
        for (Video video : videos) {
                soma += video.mediaAvaliacoes();
            }
        return soma / videos.size();
    }
}
