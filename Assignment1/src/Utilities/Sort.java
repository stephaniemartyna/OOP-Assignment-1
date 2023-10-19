package Utilities;
import java.util.Comparator;

public final class Sort {
        
    //INSERTION SORT 
    public static <T> void insertionSort(Comparable<T>[] arr, Comparator<? super T> comp) {
        long startTime = System.nanoTime();
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            Comparable<T> key = arr[i];
            int j = i - 1;
    
            while (j >= 0 && comp.compare((T)key, (T)arr[j]) < 0) {
                arr[j + 1] = arr[j];
                j--;
            }
    
            arr[j + 1] = key;
        }

        long endTime = System.nanoTime();
        printSortingInfo("Insertion Sort", arr, startTime, endTime);
    }





    //QUICK SORT
    public static <T> void quickSort(Comparable<T>[] arr, Comparator<? super T> comp) {
        long startTime = System.nanoTime();
        quickSort(arr, 0, arr.length - 1, comp);
        long endTime = System.nanoTime();
        printSortingInfo("Quick Sort", arr, startTime, endTime);
    }

    private static <T> void quickSort(Comparable<T>[] arr, int low, int high, Comparator<? super T> comp) {
        if (low < high) {
            int pi = partition(arr, low, high, comp);
            quickSort(arr, low, pi - 1, comp);
            quickSort(arr, pi + 1, high, comp);
        }
    }

    private static <T> int partition(Comparable<T>[] arr, int low, int high, Comparator<? super T> comp) {
        Comparable<T> pivot = arr[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (comp.compare((T)arr[j], (T)pivot) < 0) {
                i++;
                Comparable<T> temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        Comparable<T> temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }


    private static void printSortingInfo(String algorithm, Comparable[] arr, long startTime, long endTime) {
        long duration = (endTime - startTime) / 1_000_000;
        System.out.println(algorithm + ": " + duration + " ms");

        if (arr.length > 0) {
            System.out.println("First sorted value: " + arr[0]);
            System.out.println("Last sorted value: " + arr[arr.length - 1]);
            for (int i = 1; i < arr.length - 1; i += 1000) {
                System.out.println("Sorted value at index " + i + ": " + arr[i]);
            }
        }

        System.out.println();
    }

}
