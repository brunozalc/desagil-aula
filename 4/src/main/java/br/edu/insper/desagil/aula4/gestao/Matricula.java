package br.edu.insper.desagil.aula4.gestao;

public class Matricula {
    private Aluno aluno;
    private boolean trancado;

    public Matricula(Aluno aluno) {
        this.aluno = aluno;
        this.trancado = false;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public boolean isTrancado() {
        return trancado;
    }

    public void trancar() {
        trancado = true;
    }
}
