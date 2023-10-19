package comparableVsComparator;

public class Cylinder {
    private double height;
    private double radius;

    public Cylinder(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public double getRadius() {
        return radius;
    }

    // calculate the lateral (side) surface area of the cylinder
    public double calculateLateralSurfaceArea() {
        return 2 * Math.PI * radius * height;
    }

    // calculate the total
    public double calculateTotalSurfaceArea() {
        double lateralSurfaceArea = calculateLateralSurfaceArea();
        double baseArea = 2 * Math.PI * radius * radius; // Two circular bases

        return lateralSurfaceArea + baseArea;
    }
}
