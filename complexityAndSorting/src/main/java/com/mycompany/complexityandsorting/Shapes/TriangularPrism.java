/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.complexityandsorting.Shapes;

/**
 *
 * @author oribe
 */
public class TriangularPrism extends Shape {
    private double height;
    private double edgeLength;

    public TriangularPrism(double height, double edgeLength) {
        this.height = height;
        this.edgeLength = edgeLength;
    }

    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public double getBaseArea() {
        return (Math.sqrt(3) / 4.0) * edgeLength * edgeLength; // Area of an equilateral triangle
    }

    @Override
    public double getVolume() {
        return getBaseArea() * height;
    }
}

