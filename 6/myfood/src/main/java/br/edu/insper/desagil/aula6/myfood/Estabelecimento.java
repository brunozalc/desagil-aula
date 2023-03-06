package br.edu.insper.desagil.aula6.myfood;

import java.util.HashMap;
import java.util.List;

public class Estabelecimento {
    public String nome;
    private HashMap<Integer, Item> catalogo;

    public Estabelecimento(String nome) {
        this.nome = nome;
        this.catalogo = new HashMap<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionaItem(int codigo, Item item) {
        this.catalogo.put(codigo, item);
    }

    public double precoConjunto(List<Integer> codigos) {
        double preco = 0;
        for (int codigo : codigos) {
            preco += this.catalogo.get(codigo).calculaPreco();
        }
        return preco;
    }
}
