/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.com470.holaMundoApp.service;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author CAB COMPUTERS
 */
public class UtilidadesTest {

    @Test
    public void testConcatenar() {
        System.out.println("concatenar");
        String uno = "hola";
        String dos = "mundo";
        //instancia de clase a probar
        Utilidades instance = new Utilidades();
        
        String expResult = "hola mundo";
        String result = instance.concatenar(uno, dos);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
    //error en la implementacion
    @Test
    public void testConcatenarFallo() {
        System.out.println("concatenar");
        String uno = "hola";
        String dos = "mundo";
        //instancia de clase a probar
        Utilidades instance = new Utilidades();
        
        String expResult = "hola mundo";
        String result = instance.concatenar(uno, dos);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
    
    //error en la codificacion
    @Test
    public void testConcatenarError() {
        System.out.println("concatenar");
        String uno = null;
        String dos = "mundo";
        //instancia de clase a probar
        Utilidades instance = new Utilidades();
        
        String expResult =null;
        String result = instance.concatenar(uno, dos);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
    
}
