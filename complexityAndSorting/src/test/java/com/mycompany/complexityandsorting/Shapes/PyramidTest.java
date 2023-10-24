/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.complexityandsorting.Shapes;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author oribe
 */
public class PyramidTest {
    
    public PyramidTest() {
    }

    /**
     * Test of getHeight method, of class Pyramid.
     */
    @Test
    public void testGetHeight() {
        System.out.println("getHeight");
        Pyramid instance = new Pyramid(2.0, 2.0);
        double expResult = 2.0;
        double result = instance.getHeight();
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of getBaseArea method, of class Pyramid.
     */
    @Test
    public void testGetBaseArea() {
        System.out.println("getBaseArea");
        Pyramid instance = new Pyramid(2.0, 2.0);
        double expResult = 4.0;
        double result = instance.getBaseArea();
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of getVolume method, of class Pyramid.
     */
    @Test
    public void testGetVolume() {
        System.out.println("getVolume");
        Pyramid instance = new Pyramid(2.0, 2.0);
        double expResult = 2.6666666666666665;
        double result = instance.getVolume();
        assertEquals(expResult, result, 0);
    }
    
}
