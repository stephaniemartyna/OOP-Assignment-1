/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.complexityandsorting.Shapes;

/**
 *
 * @author oribe
 */
public class PentagonalPrism extends Shape {
    private double height;
    private double edgeLength;

    public PentagonalPrism(double height, double edgeLength) {
        this.height = height;
        this.edgeLength = edgeLength;
    }

    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public double getBaseArea() {
        return (5.0 * edgeLength * edgeLength * Math.tan(Math.toRadians(54))) / 4.0; // Area of a regular pentagon
    }

    @Override
    public double getVolume() {
        return getBaseArea() * height;
    }
}

