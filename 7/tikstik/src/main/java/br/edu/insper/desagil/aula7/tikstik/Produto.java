package br.edu.insper.desagil.aula7.tikstik;

public class Produto {
    public String nome;
    public double preco;


    public Produto(String nome, float preco) {
        this.nome = nome;
        this.preco = preco;
    }


    public String getNome() {
        return this.nome;
    }

    public double getPreco() {
        return this.preco;
    }

}
