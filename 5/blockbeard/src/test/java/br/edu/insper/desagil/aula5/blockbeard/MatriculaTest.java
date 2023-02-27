package br.edu.insper.desagil.aula5.blockbeard;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MatriculaTest {

    public Matricula m;

    @BeforeEach
    public void setUp() {
        Aluno a = new Aluno(12, "João", 6);
        m = new Matricula(a);
    }

    @Test
    void constroi() {
        assertNotNull(m.getAluno());
        assertFalse(m.isTrancada());
    }

    @Test
    void mudaTrancada() {
        m.setTrancada(true);
        assertTrue(m.isTrancada());
    }
}
