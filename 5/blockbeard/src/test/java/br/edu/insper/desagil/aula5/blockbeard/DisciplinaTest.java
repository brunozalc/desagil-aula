package br.edu.insper.desagil.aula5.blockbeard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DisciplinaTest {

    @Test
    void constroi() {
        Disciplina desagil = new Disciplina("DESAGIL", "Desenvolvimento Colaborativo Ágil");
        assertEquals("DESAGIL", desagil.getCodigo());
        assertEquals("Desenvolvimento Colaborativo Ágil", desagil.getNome());
        
    }

}
