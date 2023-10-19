package comparableVsComparator;

import java.util.Comparator;

abstract class Shape implements Comparable<Shape> {
    // Abstract methods to be implemented by subclasses
    public abstract double getVolume();
    public abstract double getBaseArea();
    public abstract double getHeight();

    // Implement the compareTo() method to compare shapes by height
    @Override
    public int compareTo(Shape other) {
        return Double.compare(this.getHeight(), other.getHeight());
    }

    // Create a Comparator to compare shapes by base area
    public static Comparator<Shape> baseAreaComparator = new Comparator<Shape>() {
        @Override
        public int compare(Shape shape1, Shape shape2) {
            return Double.compare(shape1.getBaseArea(), shape2.getBaseArea());
        }
    };

    // Create a Comparator to compare shapes by volume
    public static Comparator<Shape> volumeComparator = new Comparator<Shape>() {
        @Override
        public int compare(Shape shape1, Shape shape2) {
            return Double.compare(shape1.getVolume(), shape2.getVolume());
        }
    };
}

