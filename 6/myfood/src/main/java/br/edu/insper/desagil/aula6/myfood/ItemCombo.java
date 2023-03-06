package br.edu.insper.desagil.aula6.myfood;

import java.util.List;

public class ItemCombo extends Item {
    private double desconto;
    private List<Item> itens;

    public ItemCombo(String nome, double desconto, List<Item> itens) {
        super(nome);
        this.desconto = desconto;
        this.itens = itens;
    }

    @Override
    public double calculaPreco() {
        double preco = 0;
        for (Item item : itens) {
            preco += item.calculaPreco();
        }
        return preco * desconto;
    }
}