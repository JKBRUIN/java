/* CSD 320
 * Module 4 Assignment 4
 * Jeremiah Kellam
 * 4/4/2023
 * 
 * Assignment:
 * 1-Write a program that prompts a user to enter two strings - done
 * 2-checks the strings entered and reports if either the first string is a substring of the second string, or if the second string is a substring of the first string. - done
 * EXTRA - I added a third output if neither is a substring of the other, it bugged me... 
 */


import java.util.Scanner;

public class Kellam_320Asgmt4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, we're going to try an exercise with strings and substrings \nwhere you'll be prompted to make two \"string\" type entries.");

        System.out.println("Please enter the first string:");
        String firstEntry = scanner.nextLine();

        System.out.println("You have entered \"" + firstEntry + "\" as your first string.");

        System.out.println("Please enter the second string:");
        String secondEntry = scanner.nextLine();

        System.out.println("You have entered \"" + secondEntry + "\" as your second string.");

        if (firstEntry.contains(secondEntry)) {
            System.out.println("\"" + secondEntry + "\" is a substring of \"" + firstEntry + "\"");
        }   else if (secondEntry.contains(firstEntry)) {
            System.out.println("\"" + firstEntry + "\" is a substring of \"" + secondEntry + "\"");
        }   else {
                System.out.println("Neither is a substring of the other.");
        }
        scanner.close();
    }
}
