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
public class CylinderTest {
    
    public CylinderTest() {
    }

    /**
     * Test of getHeight method, of class Cylinder.
     */
    @Test
    public void testGetHeight() {
        System.out.println("getHeight");
        Cylinder instance = new Cylinder(2.0, 2.0);
        double expResult = 2.0;
        double result = instance.getHeight();
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of getBaseArea method, of class Cylinder.
     */
    @Test
    public void testGetBaseArea() {
        System.out.println("getBaseArea");
        Cylinder instance = new Cylinder(2.0, 2.0);
        double expResult = 12.566370614359172;
        double result = instance.getBaseArea();
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of getVolume method, of class Cylinder.
     */
    @Test
    public void testGetVolume() {
        System.out.println("getVolume");
        Cylinder instance = new Cylinder(2.0, 2.0);
        double expResult = 25.132741228718345;
        double result = instance.getVolume();
        assertEquals(expResult, result, 0);
    }
    
}
