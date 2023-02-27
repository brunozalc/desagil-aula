package br.edu.insper.desagil.aula5.blockbeard;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlunoTest {

    private Aluno aluno;
    private static final double DELTA = 0.0001;

    @BeforeEach
    void setUp() {
    	aluno = new Aluno(26, "Bruno", 7);
    }

    @Test
    void constroi() {
        assertEquals(26, aluno.getId());
        assertEquals("Bruno", aluno.getNome());
        assertEquals(7, aluno.getCr(), DELTA);
    }

    @Test
    void mudaCr() {
        aluno.setCr(8);
        assertEquals(8, aluno.getCr(), DELTA);
    }
}
