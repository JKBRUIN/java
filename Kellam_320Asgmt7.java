/*
 * CSD 320
 * Module 7 Assignment 7
 * Jeremiah Kellam
 * 4/18/2023
 * 
 * Assignment:
 * Some Websites impose certain rules for passwords. 
 * Write a method that checks whether a user's input String is a valid password. 
 * Suppose the password rules are as follows:
 *     A password must have at least eight characters.
 *     A password must contain both letters and digits.
 *     A password must contain at least one uppercase character.
 *     A password must contain at least one lowercase character.
 */

import java.util.Scanner;

public class Kellam_320Asgmt7 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please input a password.\nFor it to be valid, you must:\nHave at least eight characters,\nInclude letters and digits, A.K.A. numbers,\nHave an UPPERCASE letter,\nHave a lowercase letter.\n");

        Scanner userPass = scanner.nextLine();

        
    }
}
