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
            case "m":
                mergeSort(shapes, comparator);
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
    
    
    public static void mergeSort(Shape[] arr, Comparator<Shape> comparator){
    	int n = arr.length;

        if (n < 2) {
            return;
        }

        int mid = n / 2;
        Shape[] leftHalf = new Shape[mid];
        Shape[] rightHalf = new Shape[n - mid];

        System.arraycopy(arr, 0, leftHalf, 0, mid);
        System.arraycopy(arr, mid, rightHalf, 0, n - mid);

        mergeSort(leftHalf, comparator);
        mergeSort(rightHalf, comparator);

        merge(arr, leftHalf, rightHalf, comparator);
    }

    private static void merge(Shape[] shapes, Shape[] leftHalf, Shape[] rightHalf, Comparator<Shape> comparator) {
        int leftLength = leftHalf.length;
        int rightLength = rightHalf.length;
        int i = 0, j = 0, k = 0;

        while (i < leftLength && j < rightLength) {
            if (comparator.compare(leftHalf[i], rightHalf[j]) <= 0) {
                shapes[k++] = leftHalf[i++];
            } else {
                shapes[k++] = rightHalf[j++];
            }
        }

        while (i < leftLength) {
            shapes[k++] = leftHalf[i++];
        }

        while (j < rightLength) {
            shapes[k++] = rightHalf[j++];
        }
    }
    
    public static void selectionSortAlg(Shape[] shapes, Comparator<Shape> comparator) {
        int inputArrayLength = shapes.length;

        for (int index = 0; index < inputArrayLength; index++) {
        	//select the smallest shape starting from index 0
            Shape smallestShape = shapes[index];
            int smallestShapeIndex = index;
            
            //looping to compare the next value with the smallest index
            for (int otherIndex = index + 1; otherIndex < inputArrayLength; otherIndex++) {
                if (comparator.compare(shapes[otherIndex], smallestShape) < 0) {
                	//if the value beside the smallest is even smaller, then we'll remember that as the smallest now
                    smallestShape = shapes[otherIndex];
                    //assigns the value and the index
                    smallestShapeIndex = otherIndex;
                }
            }
            
            //Swap
            if (smallestShapeIndex != index) {
                Shape temp = shapes[index];
                shapes[index] = shapes[smallestShapeIndex];
                shapes[smallestShapeIndex] = temp;
            }
        }
    }
    	
    
    
}
