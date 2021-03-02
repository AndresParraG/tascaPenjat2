package test;

import com.jaume.penjat.Puntuacio;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestPuntuacio {

    private Puntuacio puntuacio;

    @Test
    void iniciarPartidaDificultat1() {
        puntuacio = new Puntuacio();
        puntuacio.getParaulaSecretaDificultat(1);
        assertEquals(5, puntuacio.getIntents());
    }

    @Test
    void iniciarPartidaDificultat2() {
        puntuacio = new Puntuacio();
        puntuacio.getParaulaSecretaDificultat(2);
        assertEquals(4, puntuacio.getIntents());
    }
}
