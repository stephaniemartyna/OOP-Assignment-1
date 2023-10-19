package comparableVsComparator;

import java.lang.Math;

public class Prism {
    private String type;        // Type of prism 
    private double height;      // Height 
    private double length;  // length of the base polygon

    public Prism(String type, double height, double edgeLength) {
        this.type = type;
        this.height = height;
        this.length = edgeLength;
    }

    public String getType() {
        return type;
    }

    public double getHeight() {
        return height;
    }

    public double getEdgeLength() {
        return length;
    }

    // Square Prism
    public double calculateBaseAreaSquare() {
        return length * length;
    }
    public double calculateVolumeSquare() {
        return calculateBaseAreaSquare() * height;
    }

    // Equilateral Triangle Prism
    public double calculateBaseAreaEquilateralTriangle() {
        return (length * length * Math.sqrt(3)) / 4;
    }
    public double calculateVolumeEquilateralTriangle() {
        return calculateBaseAreaEquilateralTriangle() * height;
    }

    // Pentagon Prism
    public double calculateBaseAreaPentagon() {
        double s = length;
        return (5 * s * s) / (4 * Math.tan(Math.toRadians(54)));
    }
    public double calculateVolumePentagon() {
        return calculateBaseAreaPentagon() * height;
    }

    // Octagon Prism
    public double calculateBaseAreaOctagon() {
        double s = length;
        return 2 * (1 + Math.sqrt(2)) * s * s;
    }
    public double calculateVolumeOctagon() {
        return calculateBaseAreaOctagon() * height / 4;
    }
}
