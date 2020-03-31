
package com.com470.holaMundoApp.service;

import org.junit.Test;
import static org.junit.Assert.*;

public class ValidarEmailTest {
    
    public ValidarEmailTest() {
    }
    ValidarEmail validar= ValidarEmail.getInstance();
    
    @Test
    public void testValidaEmail() {
        boolean resultado = validar.validaEmail("juancarlos.bergman.@gmail.com");
        assertTrue(resultado);
    }
     @Test
    public void testValidarEmailsinArroba(){
        validar.reset();
        boolean resultado = validar.validaEmail("juancarlos.bergman.gmail");
        assertFalse(resultado);
    }
}
