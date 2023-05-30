/*
 * CSD 320
 * Module 6 Assignment 6
 * Jeremiah Kellam
 * 4/15/2023
 * 
 * Assignment:
 * Write a program that uses nested for loops to output the following with the shown display format:
                   1               @
                 1 2 1             @
               1 2 4 2 1           @
             1 2 4 8 4 2 1         @
          1 2 4 8 16 8 4 2 1       @
       1 2 4 8 16 32 16 8 4 2 1    @
    1 2 4 8 16 32 64 32 16 8 4 2 1 @
 * 
 * References:
 * Java Code To Create Pyramid and Pattern. (n.d.). 
 *      https://www.programiz.com/java-programming/examples/pyramid-pattern
 * 
 * GeeksforGeeks. (2023b). Programs for printing pyramid patterns in Java. GeeksforGeeks. 
 *      https://www.geeksforgeeks.org/programs-printing-pyramid-patterns-java/#
 * 
 * Divertitto, A. (2022). Using the Math.pow() Method in Java. CodeGym. 
 *      https://codegym.cc/groups/posts/using-mathpow-method-in-java
 */

public class Kellam_320Asgmt6 {
    public static void main(String[] args) {
        int lines = 7;
        for (int i = 0; i < lines; i++) {
            for (int spaceL = lines - i; spaceL > 0; spaceL--) {
                if(spaceL > 4) {
                    System.out.print("  ");
                    } else {
                    System.out.print("   ");
                    }
            }
            for (int numL_C = 0; numL_C <= i; numL_C++) {
                int num = (int) Math.pow(2, numL_C); {
                    System.out.print(num + " ");
                    } 
            }
            for (int numR = i - 1; numR >= 0; numR--) {
                int num = (int) Math.pow(2, numR); {
                    System.out.print(num + " ");
                    }
            }
            for (int spaceR = lines - i; spaceR > 1; spaceR--) {
                if(spaceR > 3) {
                    System.out.print("  ");
                    } else {
                    System.out.print("   ");
                    }
            }
            System.out.print("@\n");
        }
    }
}
