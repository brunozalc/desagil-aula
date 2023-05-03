package br.edu.insper.desagil.aula20.core;

import java.util.List;

import br.pro.hashi.sdx.dao.annotation.Auto;
import br.pro.hashi.sdx.dao.annotation.Key;

public class Historico {
    private @Auto @Key String key;
    private String nome;
    private List<Paciente> pacientes;

    public Historico() {
    }

    public Historico(String nome, List<Paciente> pacientes) {
        this.nome = nome;
        this.pacientes = pacientes;
    }

    public String getNome() {
        return nome;
    }

    public List<Paciente> getPacientes() {
        return pacientes;
    }

    public String getKey() {
        return key;
    }

    

    
    
}
