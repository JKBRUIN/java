/*
 * Jeremiah Kellam
 * CSD 420 Module 2.2
 * 3/31/24
 * 
 * Create a program using a recursive method that returns the sum of the following type inputs.
 * 
 * m(i) = 1/2 + 2/3 + 3/4 + 4/5 + 5/6 … i/(i + 1)
 * 
 * ‘m’ is to be replaced with the method name you use
 * 
 * Use three different input finishing values, testing your code to ensure it functions correctly --> I used more to better see it
 * 
 * Examples: m(4), m(9), m(14). 
 */

public class Kellam_420Mod2_2 {
    public static void main(String[] args) {
        System.out.println("num(1) = " + num(1));
        System.out.println("num(2) = " + num(2));
        System.out.println("num(7) = " + num(7));
        System.out.println("num(11) = " + num(11));
        System.out.println("num(13) = " + num(13));
        System.out.println("num(17) = " + num(17));
    }

    public static double num(int i) {
        if (i == 1) {
            return (double) i / (i + 1);
        } else {
            return (double) i/ (i +1) + num(i - 1);
        }
            

    }
}  