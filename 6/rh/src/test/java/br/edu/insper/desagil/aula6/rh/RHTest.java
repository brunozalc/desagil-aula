package br.edu.insper.desagil.aula6.rh;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RHTest {
    private static final double DELTA = 0.0001;
    private RH rh;

    @BeforeEach
    public void setUp() {
        rh = new RH();
    }

    @Test
    void folhaVazia() {
        assertEquals(0.0, rh.calculaMedia(), DELTA);
    }

    @Test
    void tresFuncionarios() {
        rh.contrata(new Funcionario(0, "João", 1000.0));
        rh.contrata(new Funcionario(1, "Maria", 2000.0));
        rh.contrata(new Funcionario(2, "José", 3000.0));
        assertEquals(0.6*2000.0, rh.calculaMedia(), DELTA);
    }

    @Test
    void tresGerentes() {
        rh.contrata(new Gerente(0, "João", 1000.0));
        rh.contrata(new Gerente(1, "Maria", 2000.0));
        rh.contrata(new Gerente(2, "José", 3000.0));
        assertEquals(0.6*2000.0, rh.calculaMedia(), DELTA);
    }

    @Test
    void tresDiretores() {
        rh.contrata(new DiretorDeMarketing(0, "João", 1000.0));
        rh.contrata(new DiretorDeVendas(1, "Maria", 2000.0));
        DiretorDeVendas diretor = new DiretorDeVendas(2, "José", 3000.0);
        diretor.incrementa(1000.0);
        rh.contrata(diretor);
        assertEquals(0.6*2000.0+100, rh.calculaMedia(), DELTA);
    }

    @Test
    void misturado() {
        rh.contrata(new Funcionario(0, "João", 1000.0));
        rh.contrata(new Gerente(1, "Maria", 2000.0));
        rh.contrata(new DiretorDeMarketing(2, "José", 3000.0));
        rh.contrata(new DiretorDeVendas(3, "Joana", 4000.0));
        assertEquals(0.6*2500.0, rh.calculaMedia(), DELTA);
    }
}
