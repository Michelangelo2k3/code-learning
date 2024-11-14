// Correct package declaration
package java_.arrays; // Usa un nombre de paquete válido

import java.util.ArrayList;
import java.util.Scanner;

public class favoriteNumber {
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
                System.out.println("Removed element: " + removed);
                System.out.println("Updated list of favorite numbers: " + numbers);
            } else {
                System.out.println("Invalid index. Please try again.");
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
