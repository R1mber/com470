
package com.com470.holaMundoApp.service;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTest {
    private Calculadora calculadora;
    
    @Before
    public void setUp() {
        calculadora=new Calculadora();
    }
    
    @After
    public void tearDown(){
        calculadora=null;
    }

    @Test
    public void testSuma() {
        //when
        int suma1=calculadora.suma(3, 5);
        int suma2=calculadora.suma(0, 3);
        int suma3=calculadora.suma(-1, 3);
        //then
        assertEquals(8,suma1);
        assertEquals(3,suma2);
        assertEquals(2,suma3);
        assertNotEquals(-2,suma3);
    }

    @Test
    public void testResta() {
        //when
        int resta1=calculadora.resta(3, 5);
        int resta2=calculadora.resta(3, 0);
        int resta3=calculadora.resta(-1, 3);
        //then
        assertNotEquals(8,resta1);
        assertEquals(-2,resta1);
        assertEquals(3,resta2);
        assertEquals(-4,resta3);
    }

    @Test
    public void testMultiplicacion() {
        //when
        int multiplicacion1=calculadora.multiplicacion(3, 5);
        int multiplicacion2=calculadora.multiplicacion(0, 3);
        int multiplicacion3=calculadora.multiplicacion(-1, 3);
        //then
        assertNotEquals(8,multiplicacion1);
        assertEquals(15,multiplicacion1);
        assertEquals(0,multiplicacion2);
        assertEquals(-3,multiplicacion3);        
    }

    @Test
    public void testDivicion() {
        //when
        int divicion1=calculadora.divicion(10, 5);
        int divicion2=calculadora.divicion(3, 3);
        int divicion3=calculadora.divicion(-15, 3);
        //then
        
        assertEquals(2,divicion1);
        assertEquals(1,divicion2);
        assertEquals(-5,divicion3);
    }
       @Test (expected=Exception.class)
    public void testDivicionCero() {
        //when
        float divicion=calculadora.divicion(10, 0);
        //then
        assertNull(null);
    }
    
}
