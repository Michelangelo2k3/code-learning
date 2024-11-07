package Java.Arrays;
// Task prompt:

// Implement a program that initializes an array with our favorite numbers.
// Then, ask the user for
// the index of an element to be removed from the array. Continue removing
// elements until the entered
// index is negative or invalid.
import java.util.ArrayList;
import java.util.Scanner;

public class favoritenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initialize the list of favorite numbers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(7);
        numbers.add(14);
        numbers.add(21);
        numbers.add(28);
        numbers.add(35);

        System.out.println("Initial list of favorite numbers: " + numbers);

        while (true) {
            System.out.print("Enter the index of the element to delete (negative to exit): ");
            int index = sc.nextInt();

            // If the index is negative, exit the loop
            if (index < 0) {
                System.out.println("Negative index. Exiting the program.");
                break;
            }

            // Check if the index is within the range of the list
            if (index >= 0 && index < numbers.size()) {
                int removed = numbers.remove(index);
                System.out.println("Element " + removed + " removed. Updated list: " + numbers);
            } else {
                System.out.println("Index out of range. Try again.");
            }

            // If the list is empty, end the program
            if (numbers.isEmpty()) {
                System.out.println("No more elements in the list. Ending the program.");
                break;
            }
        }

        sc.close();
    }
}
