/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.complexityandsorting.Shapes;

import static org.junit.Assert.*;

/**
 *
 * @author oribe
 */
public class ConeTest {
    
    public ConeTest() {
    }
    /**
     * Test of getHeight method, of class Cone.
     */
    @org.junit.Test
    public void testGetHeight() {
        System.out.println("getHeight");
        Cone instance =  new Cone(2.0, 2.0);
        double expResult = 2.0;
        double result = instance.getHeight();
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of getBaseArea method, of class Cone.
     */
    @org.junit.Test
    public void testGetBaseArea() {
        System.out.println("getBaseArea");
        Cone instance = new Cone(2.0, 2.0);
        double expResult = 12.566370614359172;
        double result = instance.getBaseArea();
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of getVolume method, of class Cone.
     */
    @org.junit.Test
    public void testGetVolume() {
        System.out.println("getVolume");
        Cone instance = new Cone(2.0, 2.0);
        double expResult = 8.377580409572781;
        double result = instance.getVolume();
        assertEquals(expResult, result, 0);
    }
    
}
