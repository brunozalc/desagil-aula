package br.edu.insper.desagil.aula4.gestao;

import java.time.LocalDate;
import java.util.List;

public class Oferecimento {
    private Disciplina disciplina;
    private LocalDate inicio;
    private LocalDate fim;
    private List<Matricula> matriculas;

    public Oferecimento(Disciplina disciplina, LocalDate inicio, LocalDate fim) {
        this.disciplina = disciplina;
        this.inicio = inicio;
        this.fim = fim;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public LocalDate getInicio() {
        return inicio;
    }

    public LocalDate getFim() {
        return fim;
    }

    public void fazMatricula(Aluno aluno) {
        Matricula matricula = new Matricula(aluno);
        matriculas.add(matricula);
    }

    public int numeroDeAlunos() {
        return matriculas.size();
    }
}
