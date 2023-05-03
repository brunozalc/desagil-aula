package br.edu.insper.desagil.aula20.core;

import java.util.HashMap;
import java.util.Map;

import br.pro.hashi.sdx.dao.annotation.Key

public class Paciente {
    private @Key int numero;
    private String nome;
    private Map<String, Integer> dosagens;

    public Paciente() {
    }

    public Paciente(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
        this.dosagens = new HashMap<>();
    }

    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public Map<String, Integer> getDosagens() {
        return dosagens;
    }

    public void adiciona(String nome, int dosagem) {
        dosagens.put(nome, dosagem);
    }
    
}
