package br.edu.insper.desagil.aula5.blockbeard;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.*;

public class OferecimentoTest {

    public Disciplina disciplina;
    public LocalDate inicio;
    public LocalDate fim;
    public Oferecimento oferecimento;

    @BeforeEach
    public void setUp() {
        disciplina = new Disciplina("Desagil", "Desenvolvimento Colaborativo Ágil");
        inicio = LocalDate.of(2023, Month.FEBRUARY, 6);
        fim = LocalDate.of(2023, Month.JUNE, 30);
        oferecimento = new Oferecimento(disciplina, inicio, fim);
    }

    @Test
    void constroi() {
        assertNotNull(oferecimento.getDisciplina());
        assertNotNull(oferecimento.getInicio());
        assertNotNull(oferecimento.getFim());
        assertEquals(0, oferecimento.numeroDeAlunos());
    }

    @Test
    void fazUmaMatricula() {
        Aluno aluno = new Aluno(15, "João", 9);
        oferecimento.fazMatricula(aluno);
        assertEquals(1, oferecimento.numeroDeAlunos());
    }

    @Test
    void fazDuasMatriculas () {
        Aluno aluno1 = new Aluno(15, "João", 9);
        Aluno aluno2 = new Aluno(16, "Maria", 7);
        oferecimento.fazMatricula(aluno1);
        oferecimento.fazMatricula(aluno2);
        assertEquals(2, oferecimento.numeroDeAlunos());
    }
}
