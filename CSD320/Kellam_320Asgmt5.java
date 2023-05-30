/* CSD 320
 * Module 5 Assignment 5
 * Jeremiah Kellam
 * 4/8/2023
 * 
 * Assignment:
 * Write a java program that uses a while loop to display the following math operations 
 * both in the smaller to larger order and then the larger to smaller order 
 * with the denominator being 3 through 99.  
 * Ensure your application displays the mathematical results.
 * 
 * 1/3.0 + 1/5.0 + 1/7.0 + ··· + 1/95.0 + 1/97.0 + 1/99.0
 * 1/99.0 + 1/97.0 + 1/95.0 + ··· + 1/7.0 + 1/5.0 + 1/3.0
 * 
 * I went further...compared the results and explained why.
 * 
 * Citations:
 * The while and do-while Statements (The JavaTM Tutorials > Learning the Java Language > Language Basics). (n.d.). 
 * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/while.html
 * 
 * Java While Loop. (n.d.). https://www.w3schools.com/java/java_while_loop.asp
 * 
 * Java Type Casting. (n.d.). https://www.w3schools.com/java/java_type_casting.asp
 * 
 */

public class Kellam_320Asgmt5 {
    public static void main(String[] args) {
        double totalS2L = 0;
        int denomS2L = 3;
        System.out.print("\nThis first portion of the program will show \ndecimal equivalents of (1/n) fractions being added together \nfor a final result with the denominator \'n\' having n+2 increments \nfor each fraction starting at (3) and stopping at (99). \nThese are the incremental increase of a smaller to larger order \nof the denominator and its final result: ");
        while (denomS2L <= 99) {
            double fraction = 1.0/denomS2L;
            totalS2L += fraction;
            System.out.println();
            System.out.print(fraction + " + ");
            denomS2L += 2;
        }
        System.out.println("\nIncremental denominator result: " + totalS2L);

        double totalL2S = 0;
        int denomL2S = 99;
        System.out.print("\nThese are the decimal equivalents of the fractions added together \nwith an n-2 decremental value of the denominator \'n\' \nstarting with (99) and stopping at (3) with the final results at the end: ");
        while (denomL2S >= 3) {
            double fraction = 1.0/denomL2S;
            totalL2S += fraction;
            System.out.println();
            System.out.print(fraction + " + ");
            denomL2S -= 2;
        }
        System.out.println("\nDecremental denominator result: " + totalL2S);

        if (totalL2S == totalS2L) {
            System.out.println("\nThe results are equal and order doesn't matter.");
        }   else {
                System.out.println("\nThe incremental results " + totalS2L + " aren't equal to the \ndecremental results " + totalL2S + ". The difference in order of \nfractional operations compounded by decimal restrictions \nof the \'double\' data type, even if it is 16 places,\nultimately ended up at different results from rounding.");
        }
        float s2l = (float) totalS2L;
        float l2s = (float) totalL2S;
        if (s2l == l2s) {
            System.out.println("\nAfter casting the results to the \'float\' data type,\nthe incremental results " + s2l + " are equal to \nthe decremental results " + l2s + " and shows that reducing the accuracy \nby switching to the \'float\' data type eliminated different results, \nbut made them less precise.");
        }   else {
            System.out.println("\nEven as \'float\' data types, the results are different.");
        }
        System.out.println("\nI've only cast THE RESULTS as the \'float\' data type. \nIt is highly likely the initial results would still be different \nif a \'float\' data type was used since the very beginning, \ndue to different rounding occurring from the opposite sequences.");
    }
}