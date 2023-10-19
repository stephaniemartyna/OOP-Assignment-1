package comparableVsComparator;

import java.util.Comparator;

abstract class Shape implements Comparable<Shape> {
    public abstract double getVolume();
    public abstract double getBaseArea();
    public abstract double getHeight();

    @Override
    public int compareTo(Shape other) {
        return Double.compare(this.getHeight(), other.getHeight());
    }

    public static Comparator<Shape> baseAreaComparator = new Comparator<Shape>() {
        @Override
        public int compare(Shape shape1, Shape shape2) {
            return Double.compare(shape1.getBaseArea(), shape2.getBaseArea());
        }
    };

    public static Comparator<Shape> volumeComparator = new Comparator<Shape>() {
        @Override
        public int compare(Shape shape1, Shape shape2) {
            return Double.compare(shape1.getVolume(), shape2.getVolume());
        }
    };
}

