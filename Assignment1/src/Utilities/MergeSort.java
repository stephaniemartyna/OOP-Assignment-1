package Utilities;

public class MergeSort {
    public static void mergeSort(int[] inputArray) {
        int inputArrayLength = inputArray.length;

        // base case
        if (inputArrayLength < 2) {
            return;
        }

        // divide array into two halves
        int midIndex = inputArrayLength / 2;
        int[] leftHalf = new int[midIndex];
        // subtract the midIndex in case there is an odd number of elements
        int[] rightHalf = new int[inputArrayLength - midIndex];

        // copy the elements of our inputArray into leftHalf
        for (int i = 0; i < midIndex; i++) {
            leftHalf[i] = inputArray[i];
        }

        // copy the elements of our inputArray into rightHalf
        // we start at the midIndex and go to the end of the array
        for (int i = midIndex; i < inputArrayLength; i++) {
            // example if the middle index is 4 we start at 0
            rightHalf[i - midIndex] = inputArray[i];
        }

        // recursively call each half
        mergeSort(leftHalf);
        mergeSort(rightHalf);

        merge(inputArray, leftHalf, rightHalf);
    }

    // create the merge method
    private static void merge(int[] inputArray, int[] leftHalf, int[] rightHalf) {
        int leftHalfLength = leftHalf.length;
        int rightHalfLength = rightHalf.length;

        int i = 0; // index of leftHalf
        int j = 0; // index of rightHalf
        int k = 0; // index of inputArray

        // copy the smallest values from either the leftHalf or the rightHalf
        while (i < leftHalfLength && j < rightHalfLength) {
            if (leftHalf[i] <= rightHalf[j]) {
                inputArray[k] = leftHalf[i];
                i++;
            } else {
                inputArray[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        // copy the rest of the leftHalf
        while (i < leftHalfLength) {
            inputArray[k] = leftHalf[i];
            i++;
            k++;
        }

        // copy the rest of the rightHalf
        while (j < rightHalfLength) {
            inputArray[k] = rightHalf[j];
            j++;
            k++;
        }
    }

    private static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

}
