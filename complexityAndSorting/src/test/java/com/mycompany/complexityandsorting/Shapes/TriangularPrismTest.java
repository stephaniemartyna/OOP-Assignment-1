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
public class TriangularPrismTest {
    
    public TriangularPrismTest() {
    }

    /**
     * Test of getHeight method, of class TriangularPrism.
     */
    @Test
    public void testGetHeight() {
        System.out.println("getHeight");
        TriangularPrism instance = new TriangularPrism(2.0, 2.0);
        double expResult = 2.0;
        double result = instance.getHeight();
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of getBaseArea method, of class TriangularPrism.
     */
    @Test
    public void testGetBaseArea() {
        System.out.println("getBaseArea");
        TriangularPrism instance = new TriangularPrism(2.0, 2.0);
        double expResult = 1.7320508075688772;
        double result = instance.getBaseArea();
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of getVolume method, of class TriangularPrism.
     */
    @Test
    public void testGetVolume() {
        System.out.println("getVolume");
        TriangularPrism instance = new TriangularPrism(2.0, 2.0);
        double expResult = 3.4641016151377544;
        double result = instance.getVolume();
        assertEquals(expResult, result, 0);
    }
    
}
