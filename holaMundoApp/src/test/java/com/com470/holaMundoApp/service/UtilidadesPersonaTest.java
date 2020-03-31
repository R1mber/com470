
package com.com470.holaMundoApp.service;

import com.com470.holaMundoApp.model.Persona;
import org.junit.Test;
import static org.junit.Assert.*;


public class UtilidadesPersonaTest {
    private UtilidadesPersona utils=new UtilidadesPersona();
    
    public UtilidadesPersonaTest() {
    }

    @Test
    public void testGetCarlos() {
        //when
        Persona carlos=utils.getCarlos();
        //then
        assertEquals("Carlos",carlos.getNombres());
        assertEquals("Romero",carlos.getApellidos());
    }

    @Test
    public void testGetJuan() {
        //when
        Persona juan=utils.getJuan();
        //then
        assertEquals("Juan",juan.getNombres());
        assertEquals("Perez",juan.getApellidos());
    }
    
    @Test
    public void testPersonasDiferentes() {
        //when
        Persona juan=utils.getJuan();
        Persona carlos=utils.getCarlos();
        //then
        assertNotEquals(juan,carlos);
        
    }
}
