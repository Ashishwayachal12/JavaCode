import java.util.Scanner;

public class InsertionSort {

    // Function that performs Insertion Sort
    public static void insertionSort(int[] array, int N, int K) {
        int i, flag, j;

        // Start from index 1
        for (i = 1; i < N; i++) {
            // Store current element in flag
            flag = array[i];
            j = i - 1;

            // Move the flag element until
            // its previous element is greater
            // or index is 0
            while (j >= 0 && array[j] > flag) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            // Assign the flag value
            // to correct index
            array[j + 1] = flag;
        }
    }

    // Function to print the array
    public static void printArray(int[] array, int length) {
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // Main function
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[100];
        int N, K;

        System.out.print("Enter Number of elements: ");
        N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the value of K: ");
        K = scanner.nextInt();

        insertionSort(array, N, K);

        System.out.println("Sorted Array");
        printArray(array, N);

        scanner.close();
    }
}
