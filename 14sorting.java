
// bubble sort 
import java.util.*;

class BubbleSort {

    public static void printArray(int[] arr) {
        System.out.print("Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");

        int n = scanner.nextInt();
        arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        printArray(arr);

        // Call bubble sort
        System.out.println("Sorting the array using Bubble Sort...");
        bubbleSort(arr);

        printArray(arr);
    }

    public static void bubbleSort(int[] arr) { // time complexity O(n^2), space complexity O(1)
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped by inner loop, then break
            if (!swapped) break;
        }
    }
}


// selection sort
class SelectionSort {

    public static void printArray(int[] arr) {
        System.out.print("Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");

        int n = scanner.nextInt();
        arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        printArray(arr);

        // Call selection sort
        System.out.println("Sorting the array using Selection Sort...");
        selectionSort(arr);

        printArray(arr);
    }

    public static void selectionSort(int[] arr) { // time complexity O(n^2), space complexity O(1)
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            if (minIndex != i) {
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }
}


// insertion sort
class InsertionSort {

    public static void printArray(int[] arr) {
        System.out.print("Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");

        int n = scanner.nextInt();
        arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        printArray(arr);

        // Call insertion sort
        System.out.println("Sorting the array using Insertion Sort...");
        insertionSort(arr);

        printArray(arr);
    }

    public static void insertionSort(int[] arr) { // time complexity O(n^2), space complexity O(1)
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int current = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1], that are greater than key,
            // to one position ahead of their current position
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
    }
}