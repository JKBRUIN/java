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
 * 
 * Citations:
 * 
 * Java Booleans. (n.d.). https://www.w3schools.com/java/java_booleans.asp
 * 
 * Java If . . . Else. (n.d.). https://www.w3schools.com/java/java_conditions.asp
 * 
 * Max O’Didily. (2017, November 11). Java Validation: Validating a Password [Video]. YouTube. 
 *      https://www.youtube.com/watch?v=kN8mqSvNFa4
 * 
 */

import java.util.Scanner;

public class Kellam_320Asgmt7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please input a password.\nFor it to be valid, you must:\nHave at least eight characters,\nInclude letters and digits, A.K.A. numbers,\nHave an UPPERCASE letter,\nHave a lowercase letter.\n");

        String userPass = scanner.nextLine();

        if (passwordValid(userPass)) {
            System.out.println("Your password is Valid");
        } else {
            System.out.println("Your password is invalid");
        }
    }

    public static boolean passwordValid(String userPass) {
        if (userPass.length() < 8) {
            return false;
        }

        boolean hasDigit = false;
        boolean hasUpper = false;
        boolean hasLower = false;
        char c;
        
        for (int i = 0; i < userPass.length(); i++) {
            c = userPass.charAt(i);
            if (Character.isDigit(c)) {
                hasDigit = true;
            } else if (Character.isUpperCase(c)) {
                hasUpper = true;
            } else if (Character.isLowerCase(c)) {
                hasLower = true;
            } 
            if (hasDigit && hasUpper && hasLower) {
                return true;
            }
        }
        return false;
    }
}