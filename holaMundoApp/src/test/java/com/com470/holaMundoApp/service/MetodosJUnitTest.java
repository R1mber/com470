package com.com470.holaMundoApp.service;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class MetodosJUnitTest {
    
    public MetodosJUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Antes de todos los Test ");
    }
    
   
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Despues de todos los Test");
    }
    
    @Before
    public void setUp() {
        System.out.println("antes de cada Test");
    }
    
    @After
    public void tearDown() {
        System.out.println("Despues de cada Test\n");
    }

    @Test
    public void primerTest() {
        System.out.println("primer Test");
        fail("The test case is a prototype.");
    }
    @Test
    public void segundoTest() {
        System.out.println("segundo Test");
        fail("The test case is a prototype.");
    }
}
