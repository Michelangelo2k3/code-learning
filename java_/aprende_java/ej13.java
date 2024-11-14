// Write a program that fills an array of 100 elements with random integers between 
// 0 and 500 (both inclusive). Then, the program should display the array and ask 
// the user if they want to highlight the maximum or the minimum. The program will 
// then display the array again, with the chosen number highlighted by surrounding 
// it with double asterisks.
import java.util.Random;
import java.util.Scanner;

public class ej13 {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        // Fill the array with random integers between 0 and 500
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(501);
        }

        // Display the array
        System.out.println("Array:");
        displayArray(array, -1);

        // Ask the user if they want to highlight the maximum or the minimum
        int choice = 0;
        for (int i = 0; i < 1; i++) {
            System.out.println("Do you want to highlight the (1) maximum or (2) minimum?");
            System.out.print("Enter your choice (1 or 2): ");
            choice = sc.nextInt();
            if (choice != 1 && choice != 2) {
                System.out.println("Invalid choice. Please enter 1 or 2.");
                i--; // Decrement i to repeat the loop
            }
        }

        // Find the index of the maximum or minimum value
        int index = (choice == 1) ? findMaxIndex(array) : findMinIndex(array);

        // Display the array again with the chosen number highlighted
        System.out.println("Highlighted Array:");
        displayArray(array, index);

        sc.close();
    }

    // Display array helper method
    public static void displayArray(int[] array, int highlightIndex) {
        for (int i = 0; i < array.length; i++) {
            if (i == highlightIndex) {
                System.out.printf("**%3d** ", array[i]);
            } else {
                System.out.printf("%3d ", array[i]);
            }
        }
        System.out.println();
    }

    // Method to find the index of the maximum value in the array
    public static int findMaxIndex(int[] array) {
        int maxIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    // Method to find the index of the minimum value in the array
    public static int findMinIndex(int[] array) {
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }
}
