/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.complexityandsorting.Shapes;

/**
 *
 * @author oribe
 */
public class OctagonalPrism extends Shape {
    private double height;
    private double edgeLength;

    public OctagonalPrism(double height, double edgeLength) {
        this.height = height;
        this.edgeLength = edgeLength;
    }

    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public double getBaseArea() {
        return 2.0 * (1.0 + Math.sqrt(2)) * edgeLength * edgeLength; // Area of a regular octagon
    }

    @Override
    public double getVolume() {
        return (getBaseArea() * height) / 4.0;
    }
}

