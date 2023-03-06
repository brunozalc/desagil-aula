package br.edu.insper.desagil.aula6.myfood;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EstabelecimentoTest {
    public static final double DELTA = 0.0001;

    private Estabelecimento e;
    private List<Integer> codigos;

    @BeforeEach
    void setUp() {
        e = new Estabelecimento("MyFood");
        codigos = new ArrayList<>();
    }

    @Test
    void doisdeTresComuns() {
        e.adicionaItem(1, new ItemComum("Coca-Cola", 5.0));
        e.adicionaItem(2, new ItemComum("Pepsi", 4.0));
        e.adicionaItem(3, new ItemComum("Guaraná", 5.5));

        codigos.add(1);
        codigos.add(2);
        assertEquals(9.0, e.precoConjunto(codigos), DELTA);
    }

    @Test
    void doisComunsUmCombo() {
        e.adicionaItem(1, new ItemComum("Hambúrguer", 15.0));
        e.adicionaItem(2, new ItemComum("Batata-frita", 6.0));
        e.adicionaItem(3, new ItemCombo("Combo", 0.8, List.of(
            new ItemComum("Hot-dog", 8.0),
            new ItemComum("Pepsi", 4.0)
        )));
        e.adicionaItem(4, new ItemComum("Guaraná", 5.5));

        codigos.add(2);
        codigos.add(3);
        codigos.add(4);
        assertEquals(21.1, e.precoConjunto(codigos), DELTA);
    }

    @Test
    void umComumDoisCombos() {
        e.adicionaItem(1, new ItemComum("Hambúrguer", 15.0));
        e.adicionaItem(2, new ItemCombo("Combo", 0.8, List.of(
            new ItemComum("Hot-dog", 6.0),
            new ItemComum("Pepsi", 4.0)
        )));
        e.adicionaItem(3, new ItemCombo("Combo", 0.8, List.of(
            new ItemComum("Coca-Cola", 4.0),
            new ItemComum("Batata-frita", 6.0)
        )));

        codigos.add(1);
        codigos.add(2);
        codigos.add(3);
        assertEquals(31.0, e.precoConjunto(codigos), DELTA);
    }
}
