import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    int aforoVipMax = 10;
    int aforoGenMax = 20;
    String[][] listaEvento = new String[10][5];
    Main gestion = new Main();
    @BeforeEach
    public void llenarLista(){
        listaEvento[0] = new String[] {"Pedro","25","General","0","True"};
        listaEvento[1] = new String[] {"Eduardo","20","Vip","1","False"};
        listaEvento[2] = new String[] {"Pepito","15","False","10","False"};
        listaEvento[3] = new String[] {"Mark","28","Vip","2","False"};
        listaEvento[4] = new String[] {"Jose","40","General","0","True"};
        System.out.println("Se han cargado los invitados...");

    }

    @org.junit.jupiter.api.Test
    void verificarEdad() {
        assertTrue(gestion.verificarEdad(listaEvento,0));
        assertTrue(gestion.verificarEdad(listaEvento,1));
        assertFalse(gestion.verificarEdad(listaEvento,2));
        assertTrue(gestion.verificarEdad(listaEvento,3));
        assertTrue(gestion.verificarEdad(listaEvento,4));
        System.out.println("Se han verificado las edades correctamente...");
    }

    @org.junit.jupiter.api.Test
    void verificarBoleto() {
        assertEquals("General",gestion.verificarBoleto(listaEvento,0));
        assertEquals("Vip",gestion.verificarBoleto(listaEvento,1));
        assertEquals("False",gestion.verificarBoleto(listaEvento,2));
        assertEquals("Vip",gestion.verificarBoleto(listaEvento,3));
        assertEquals("General",gestion.verificarBoleto(listaEvento,4));
        System.out.println("Se han verificado los boletos correctamente...");
    }

    @org.junit.jupiter.api.Test
    void validarInvitados() {
        assertTrue(gestion.validarInvitados(listaEvento,0));
        assertTrue(gestion.validarInvitados(listaEvento,1));
        assertFalse(gestion.validarInvitados(listaEvento,2));
        assertTrue(gestion.validarInvitados(listaEvento,3));
        assertTrue(gestion.validarInvitados(listaEvento,4));
        System.out.println("Se han validado a los invitados correctamente...");
    }

    @org.junit.jupiter.api.Test
    void aforoDisponible() {
        assertEquals(10,gestion.aforoDisponible(listaEvento,"Vip",aforoVipMax));
        assertEquals(18,gestion.aforoDisponible(listaEvento,"General",aforoGenMax));
        System.out.println("Se ha obtenido el aforo correctamente...");
    }

    @org.junit.jupiter.api.Test
    void ingresarPersona() {
        assertTrue(gestion.ingresarPersona(listaEvento,0));
        assertTrue(gestion.ingresarPersona(listaEvento,1));
        assertTrue(gestion.ingresarPersona(listaEvento,2));
        assertTrue(gestion.ingresarPersona(listaEvento,3));
        assertTrue(gestion.ingresarPersona(listaEvento,4));
        System.out.println("Se realizo la actualizacion de estado correctamente...");
    }

    @org.junit.jupiter.api.Test
    void permitirEntrada() {
    }

    @org.junit.jupiter.api.Test
    void removerPersonal() {
    }
}