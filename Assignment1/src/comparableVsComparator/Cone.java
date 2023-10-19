package comparableVsComparator;

public class Cone {
    private double height;
    private double radius;

    public Cone(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public double getRadius() {
        return radius;
    }

    // Method to calculate the base area of the cone
    public double calculateBaseArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate the lateral surface area of the cone
    public double calculateLateralSurfaceArea() {
        double slantHeight = Math.sqrt(radius * radius + height * height);
        return Math.PI * radius * slantHeight;
    }

    // Method to calculate the total surface area of the cone
    public double calculateTotalSurfaceArea() {
        double baseArea = calculateBaseArea();
        double lateralSurfaceArea = calculateLateralSurfaceArea();

        return baseArea + lateralSurfaceArea;
    }
}
