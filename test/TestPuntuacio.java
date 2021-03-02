package test;

import com.jaume.penjat.Puntuacio;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestPuntuacio {

    private Puntuacio puntuacio;

    @BeforeEach
    void inicialitzarPuntuacio() {
        this.puntuacio = new Puntuacio();
    }

    @Test
    void iniciarPartidaDificultat1() {
        puntuacio.getParaulaSecretaDificultat(1);
        assertEquals(5, puntuacio.getIntents());
    }

    @Test
    void iniciarPartidaDificultat2() {
        puntuacio.getParaulaSecretaDificultat(2);
        assertEquals(4, puntuacio.getIntents());
    }

    @Test
    void iniciarPartidaDificultat3() {
        puntuacio.getParaulaSecretaDificultat(3);
        assertEquals(3, puntuacio.getIntents());
    }

    @Test
    void iniciarPartidaDificultatErrada() {
        assertEquals("err", puntuacio.getParaulaSecretaDificultat(0));
    }

    @Test
    void inciarPartidaParaulaDificultat1() {
        assertTrue(puntuacio.stringContainsItemFromList(puntuacio.getParaulaSecretaDificultat(1), puntuacio.getParaules1()));
    }

    @Test
    void inciarPartidaParaulaDificultat2() {
        assertTrue(puntuacio.stringContainsItemFromList(puntuacio.getParaulaSecretaDificultat(2), puntuacio.getParaules1()));
    }

    @Test
    void inciarPartidaParaulaDificultat3() {
        assertTrue(puntuacio.stringContainsItemFromList(puntuacio.getParaulaSecretaDificultat(3), puntuacio.getParaules3()));
    }
}
