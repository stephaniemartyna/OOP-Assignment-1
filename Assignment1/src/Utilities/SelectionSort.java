package Utilities;

public class SelectionSort {
    // first try static
    public void selectionSortAlg(int[] inputArray) {

        // Create a variable to know the length of the inputArray
        int inputArrayLength = inputArray.length;

        // we need to create a variable for the sorted array
        int[] sortedArray = new int[inputArrayLength];

        // we will start with the first element in the unsorted array and remember it as
        // the smallest
        for (int index = 0; index < inputArrayLength; index++) {
            // Compare the first index to the second.
            // create a variable to hold the smallest element
            int smallestElement = inputArray[index];

            // variable to hold the index of the current element
            int smallestElementIndex = index;

            // compare the first element to the next element
            // Find the smallest element in the remaining unsorted portion of the array
            for (int otherIndex = index + 1; otherIndex < inputArrayLength; otherIndex++) {
                if (inputArray[otherIndex] < smallestElement) {
                    smallestElement = inputArray[otherIndex];
                    smallestElementIndex = otherIndex;
                }
            }
            // If the first element is smaller than the next one DON’T SWAP
            // add the element to the sorted array at the index
            // Swap the smallest element with the current element, if needed
            if (smallestElementIndex != index) {
                int temp = inputArray[index];
                inputArray[index] = inputArray[smallestElementIndex];
                inputArray[smallestElementIndex] = temp;
            }

            // Add the element to the sorted array at the correct index
            sortedArray[index] = smallestElement;

            // If the first element is bigger than the next one SWAP
            // add the element to the sorted array at the index

        }
    }

    // Prints the array
    void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // main function
    public static void main(String args[]) {
            SelectionSort ob = new SelectionSort() );  
            int arr[] = { 64, 25, 12, 22, 19 };

        ob.selectionSortAlg(arr);

            ob.printArray(arr);
        }
}
