/*
 * CSD 320 
 * Module 9 Assignment 9
 * Jeremiah Kellam
 * 4/28/2023
 *
 * Assignment:
 * Write a program that reads and fills an array with 20 integers. Then, using the array elements, calculate the data to find and display:
 *     The highest value entered.
 *     The lowest value entered.
 *     The average of the numbers entered.
 *     The sum of the numbers entered.
 * Display this information in a readable display making the data easy to understand.
 * 
 * Citations:
 * Alex Lee. (2023, March 30). How To Get Array Input From A User In Java Using Scanner [Video]. YouTube. 
 *      https://www.youtube.com/watch?v=yHvQVc0WUF4
 * 
 * Tech With Tim. (2019, January 1). Java Tutorial for Beginners #8 - Arrays [Video]. YouTube. 
 *      https://www.youtube.com/watch?v=_Wf2rbL9wQU
 * 
 * Tech With Tim. (2019b, January 3). Java Tutorial for Beginners #10 - For Loops (Continued) [Video]. YouTube. 
 *      https://www.youtube.com/watch?v=v6mkj9H629Q
 * 
 * GeeksforGeeks. (2022d). Scanner  hasNextInt   method in Java with Examples. GeeksforGeeks. 
 *      https://www.geeksforgeeks.org/scanner-hasnextint-method-in-java-with-examples/
 * 
 * Logical operators - Javatpoint. (n.d.). www.javatpoint.com. 
 *      https://www.javatpoint.com/logical-operators#:~:text=%28Logical%20NOT%20operator%29%20This%20logical%20operator%20is%20represented,will%20return%20the%20opposite%20possible%20values%20of%20A.
 * 
 * Getting Min and Max from array. (n.d.). Stack Overflow. 
 *      https://stackoverflow.com/questions/17598575/getting-min-and-max-from-array#:~:text=int%20min%3Dnum%20%3B%20int%20max%3Dnum%20%3B%20Move%20min,Beware%20of%20averages%20being%20truncated%20due%20to%20ints
 * 
 * Nathan Schutz. (2013, October 29). Print Formatting Part 1: printf() Conversion Type Characters (Java) [Video]. YouTube. 
 *      https://www.youtube.com/watch?v=moQ3Kr8ouiU
 * 
 * Nathan Schutz. (2013b, October 30). Print Formatting Part 3: printf() Precision (Java) [Video]. YouTube. 
 *      https://www.youtube.com/watch?v=gv7b9GheUyg
 */

import java.util.Scanner;

public class Kellam_320Asgmt9 {
    public static void main(String[] args) {
        int[] digits = new int[20];
        Scanner input = new Scanner(System.in);
        System.out.println("We'll be building an array of integers, a.k.a. whole numbers, made up of 20 entries.");

        for (int i = 0; i < digits.length; i++) {
            System.out.printf("Please enter integer #%d: ", i + 1);
            while (!input.hasNextInt()) { // check if input is an integer
                System.out.println("Invalid input. Please enter an integer.");
                System.out.printf("Please enter integer #%d: ", i + 1);
                input.next(); // discard the invalid input
            }
            digits[i] = input.nextInt();
        }

        int max = digits[0];
        int min = digits[0];
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] > max) {
                max = digits[i];
            } 
            if (digits[i] < min) {
                min = digits[i];
            }
        }  

        int sum = 0;
        for (int elements : digits) {
            sum += elements;
        }
        double average = (double) sum / digits.length;

        System.out.printf("The highest entry was %d.\n", max);
        System.out.printf("The lowest entry was %d.\n", min);
        System.out.printf("The average of the entries was %.2f.\n", average);
        System.out.printf("The sum of the entries was %d.\n", sum);
    }
}
