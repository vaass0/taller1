import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    int aforoVipMax = 10;
    int aforoGenMax = 20;
    String[][] listaEvento = new String[10][5];
    Main gestion = new Main();

    @BeforeEach
    public void llenarLista() {
        listaEvento[0] = new String[]{"Pedro", "25", "General", "0", "True"};
        listaEvento[1] = new String[]{"Eduardo", "20", "Vip", "1", "False"};
        listaEvento[2] = new String[]{"Pepito", "15", "False", "0", "False"};
        listaEvento[3] = new String[]{"Mark", "28", "Vip", "0", "False"};
        listaEvento[4] = new String[]{"Jose", "40", "General", "0", "True"};

    }

    @org.junit.jupiter.api.Test
    void verificarEdad() {
        assertTrue(gestion.verificarEdad(listaEvento, 0));
        assertTrue(gestion.verificarEdad(listaEvento, 1));
        assertFalse(gestion.verificarEdad(listaEvento, 2));
        assertTrue(gestion.verificarEdad(listaEvento, 3));
        assertTrue(gestion.verificarEdad(listaEvento, 4));
    }
}

