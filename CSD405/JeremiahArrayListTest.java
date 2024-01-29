/*
 * Jeremiah Kellam
 * CSD 405
 * Module 4 Assignment
 * 1/28/2024
 * 
 *  * This is the program I wrote for the class before I had to withdraw due to a family medical emergency.
 * If there is an issue using my work, please let me know.  
 * 
 * Create a class <yourName>ArrayListTest =Done
 * 
 * This class is to contain:
 *     A method that receives an ArrayList populated with an Integer data type holding the integers received from user input. =Done
 *     The user input is to accept Integers that are then assigned to the ArrayList until a value of 0 is entered, which is also assigned to the ArrayList. =Done
 *     The ArrayList is then to be sent to the method. =Done
 *     The method is then to return the largest value in the ArrayList. =Done
 *     If the ArrayList is sent in empty, the method will then return 0. =Done(?)
 *     The method signature is to be: public static Integer max (ArrayList list). =Done
 *     Write additional code for testing your method. =Done
 *     The method will return the largest value that is displayed to the user. =Done(again?)
 */

import java.util.ArrayList;
import java.util.Scanner;

public class JeremiahArrayListTest { 
/* I couldn't get it to work like I had before with Kellam_405Asmgt4 being my public class 
 * and JeremiahArrayListTest being a class outside, was there a way to do it? 
 */
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any amount of numbers(integers) to fill an ArrayList (enter 0 to stop):");

        int input;
        do {
            input = scanner.nextInt();
            integers.add(input);
        } while (input != 0);

        // Close the scanner after input is done
        scanner.close();

        int maxNumber = max(integers);
        int minNumber = min(integers);
        int count = countElements(integers);

        System.out.println("Confirmed Stop, show 'stop' entry in the ArrayList: " + minNumber);
        System.out.println("Largest number in the ArrayList: " + maxNumber);
        System.out.println("Number of entries in the ArrayList: " + count);
    }

    public static Integer max(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            return 0; //Wouldn't the ArrayList never be empty with scanner requiring '0' to stop?
        }

        int max = Integer.MIN_VALUE;
        for (int number : list) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public static Integer min(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            return 0; //Again, wouldn't the ArrayList never be empty with scanner requiring '0' to stop?
        }

        int min = Integer.MAX_VALUE;
        for (int number : list) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    public static int countElements(ArrayList<Integer> list) {
        return list.size();
    }
}
