package comparableVsComparator;

public class Pyramid {
    private double height;
    private double length;

    public Pyramid(double height, double edgeLength) {
        this.height = height;
        this.length = edgeLength;
    }

    public double getHeight() {
        return height;
    }

    public double getEdgeLength() {
        return length;
    }

    // Method to calculate the base area
    public double calculateBaseArea() {
        return length * length;
    }

    // Method to calculate the lateral surface area 
    public double calculateLateralSurfaceArea() {
        double perimeter = 4 * length;
        return (perimeter * height) / 2;
    }

    // Method to calculate the total 
    public double calculateTotalSurfaceArea() {
        double baseArea = calculateBaseArea();
        double lateralSurfaceArea = calculateLateralSurfaceArea();

        return baseArea + lateralSurfaceArea;
    }
}

