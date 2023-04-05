/*
 * CSD320
 * Module 3 Assignment 3
 * Jeremiah Kellam
 * 3/30/23
 */

/*
 *Write a program that is similar to the popular game titled “Rock-Paper-Scissors.
 *The program randomly generates the number of 1, 2, or 3 with 1 being Rock, 2 being Paper, and 3 being Scissors.
 *Then, the program is to prompt the user to enter a value of 1, 2, or 3.
 *Next, the program displays a clear readable message displaying both
 *the computer’s selection, the user’s selection, and the results. 
 */

import java.util.Random;
import java.util.Scanner;

public class Kellam_Mod3Asgmt3 {
    public static void main(String[] args) {
        System.out.println("Hello, we're going to try and play Rock-Paper-Scissors");
        System.out.println("You will input either 1 for Rock, 2 for Paper, or 3 for Scissors.");
        System.out.println("Then the computer will randomly generate a number for its turn.");
        System.out.println("You will win, lose, or draw depending on your choice!");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input 1 for Rock, 2 for Paper, or 3 for Scissors!");
        int userPick = scanner.nextInt();

        Random random = new Random();
        int compRoll = random.nextInt(3) + 1;

        System.out.println("You input " + userPick + ".");
        System.out.println("The computer selected a " + compRoll + ".");

        if (userPick == 1 && compRoll == 3 || 
            userPick == 2 && compRoll == 1 ||
            userPick == 3 && compRoll == 2) {
                System.out.println("You beat the computer!");
            }
        else if (userPick == compRoll) {
            System.out.println("It was a draw, this time.");
            }
        else {
            System.out.println("The computer won this round.");
            }
        scanner.close();
    }
}
