package com.mycompany.complexityandsorting;
import com.mycompany.complexityandsorting.Shapes.Shape;

import java.util.Comparator;

/**
 *
 * @author oribermudez
 */
public class Utility {
    public static void sortShapes(Shape[] shapes, Comparator<Shape> comparator, String sortingMethod) {
        
        if (shapes == null || shapes.length <= 1) {
            return; // No need to sort an empty or single-element array
        }

        if (comparator == null) {
            throw new IllegalArgumentException("Comparator cannot be null");
        }
        
        switch (sortingMethod) {
            case "b":
                bubbleSort(shapes, comparator);
                break;
            case "h":
                heapSort(shapes, comparator);
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
    
    public static void bubbleSort(Shape[] arr, Comparator<Shape> comparator) {
        int n = arr.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (comparator.compare(arr[i - 1], arr[i]) > 0) {
                    // Swap arr[i-1] and arr[i]
                    // Create swap function
                    Shape temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }
    
    public static void heapSort(Shape arr[], Comparator<Shape> comparator) {
        int n = arr.length;

        // Build a max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i, comparator);
        }

        // One by one extract elements from the heap
        for (int i = n - 1; i > 0; i--) {
            // Move the current root to the end
            Shape temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Call max heapify on the reduced heap
            heapify(arr, i, 0, comparator);
        }
    }

    private static void heapify(Shape[] arr, int n, int i, Comparator<Shape> comparator) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && comparator.compare(arr[left], arr[largest]) < 0) {
            largest = left;
        }

        if (right < n && comparator.compare(arr[right], arr[largest]) < 0) {
            largest = right;
        }

        if (largest != i) {
            Shape swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest, comparator);
        }
    }
    
}
