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
public class PentagonalPrismTest {
    
    public PentagonalPrismTest() {
    }

    /**
     * Test of getHeight method, of class PentagonalPrism.
     */
    @Test
    public void testGetHeight() {
        System.out.println("getHeight");
        PentagonalPrism instance = new PentagonalPrism(2.0, 2.0);
        double expResult = 2.0;
        double result = instance.getHeight();
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of getBaseArea method, of class PentagonalPrism.
     */
    @Test
    public void testGetBaseArea() {
        System.out.println("getBaseArea");
        PentagonalPrism instance = new PentagonalPrism(2.0, 2.0);
        double expResult = 6.881909602355867;
        double result = instance.getBaseArea();
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of getVolume method, of class PentagonalPrism.
     */
    @Test
    public void testGetVolume() {
        System.out.println("getVolume");
        PentagonalPrism instance = new PentagonalPrism(2.0, 2.0);
        double expResult = 13.763819204711734;
        double result = instance.getVolume();
        assertEquals(expResult, result, 0);
    }
    
}
