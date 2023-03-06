package br.edu.insper.desagil.aula6.myfood;

public class ItemComum extends Item {
    private double preco;

    public ItemComum(String nome, double preco) {
        super(nome);
        this.preco = preco;
    }

    @Override
    public double calculaPreco() {
        return preco;
    }
}
