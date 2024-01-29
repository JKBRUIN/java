/*
 * Jeremiah Kellam
 * CSD 405
 * Module 5 Assignment Program #1
 * 1/28/2024
 * 
 *  This is the program I wrote for the class before I had to withdraw due to a family medical emergency.
 * If there is an issue using my work, please let me know.  
 * 
 * 
 *Assignment:
     Program 1: 
     Write a program that uses an ArrayList filled with a minimum of 10 Strings. Use a ‘for-each’ loop to print the ArrayList collection. 
     Then ask a user which element they would like to see again. 
     Then, attempt printing the element in a try/catch format which will result in the element being display. 
     If the element value received is invalid, display a message that an Exception has been thrown displaying "Out of bounds". 
     In this program, include the use of Autoboxing/Auto-Unboxing, working with a user String input.
 */
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Kellam_405Asgmt5_1 {
    public static void main(String[] args) {
        List<String> program1 = new ArrayList<>();
        program1.add("Alarm");
        program1.add("Brush Teeth");
        program1.add("Shower");
        program1.add("Deodorant");
        program1.add("Undergarments");
        program1.add("Clothes");
        program1.add("Shoes");
        program1.add("Phone");
        program1.add("Wallet");
        program1.add("Keys");
        program1.add("Coffee");

        System.out.println("List of elements in the ArrayList:");
        for (String element : program1) {
            System.out.println(element);
        }

        Scanner scanner = new Scanner(System.in);
        boolean validInput = false;

        while (!validInput) {
            System.out.println("While remembering 'n-1' for indexing, please enter the index (element #) of what you would like to see again: ");
            try {
                Integer index = scanner.nextInt(); //Autoboxing int to Integer
                String selectedElement = program1.get(index); //Auto-unboxing Integer to int
                System.out.println("Selected element: " + selectedElement);
                validInput = true;
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Exception: Entry is 'Out of Bounds', please enter a valid index.");
            } catch (InputMismatchException e) {
                System.out.println("Exception: Invalid input, please enter a valid index.");
                scanner.next();  
            }
        }

        scanner.close();
    }
}
