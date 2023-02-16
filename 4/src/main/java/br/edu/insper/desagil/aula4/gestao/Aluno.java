package br.edu.insper.desagil.aula4.gestao;

public class Aluno {
    private int identificador;
    private String nome;
    private double cr;

    public Aluno(int identificador, String nome, double cr) {
        this.identificador = identificador;
        this.nome = nome;
        this.cr = cr;
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getNome() {
        return nome;
    }

    public double getCr() {
        return cr;
    }

    public void setCr(double cr) {
        this.cr = cr;
    }
}
