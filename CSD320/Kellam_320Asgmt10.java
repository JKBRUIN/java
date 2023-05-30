/*
 * CSD 320 
 * Module 10 Assignment
 * Jeremiah Kellam
 * 5/2/2023
 * 
 * Write four overloaded methods that return the average of an array with the following headers:
 *     public static short average(short [] array)
 *     public static int average(int [] array)
 *     public static long average(long [] array)
 *     public static double average(double [] array)
 * 
 * Write a test program that invokes each of these methods and then displays the average value returned along with a display of the original array elements. 
 * Ensure the display is easy to read and understandable. 
 * Lastly, each array sent into the methods must be of different sizes to ensure the method code is correctly written.
 * 
 * Citations:
 *
 * Java Method Overloading. (n.d.). 
 *      https://www.w3schools.com/java/java_methods_overloading.asp
 * 
 * Rahaman, A. (July 16th, 2021). Java short Array - short Array in Java. www.hudatutorials.com. 
 *      https://www.hudatutorials.com/java/basics/java-arrays/java-short-array
 * 
 * Rahaman, A. (October 22nd, 2021). Java int Array - int Array in Java. www.hudatutorials.com. 
 *      https://www.hudatutorials.com/java/basics/java-arrays/java-int-array
 * 
 * Rahaman, A. (July 16th, 2021). Java long Array - long Array in Java, Initializing. www.hudatutorials.com. 
 *      https://www.hudatutorials.com/java/basics/java-arrays/java-long-array
 * 
 * Rahaman, A. (July 16th, 2021). Java float Array - float Array in Java. www.hudatutorials.com. 
 *      https://www.hudatutorials.com/java/basics/java-arrays/java-float-array
 * 
 * Rupani, S. (2022). Long.MAX_VALUE & Long.MIN_VALUE in Java [Practical Examples] | GoLinuxCloud. GoLinuxCloud. 
 *      https://www.golinuxcloud.com/long-max-value-min-value-in-java/
 */

import java.util.Arrays; 

public class Kellam_320Asgmt10 {

    public static short average(short[] array) {
        short sum = 0;
        for (short value : array) {
            sum += value;
        }
        return (short) (sum / array.length);
    }

    public static int average(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum / array.length;
    }

    public static long average(long[] array) {
        long sum = 0L;
        for (long value : array) {
            sum += value;
        }
        return sum / array.length;
    }

    public static double average(double[] array) {
        double sum = 0.0;
        for (double value : array) {
            sum += value;
        }
        return sum / array.length;
    }

    public static void main(String[] args) {
        short[] shortArray = {-32768, 32767, 1984, 451, 22};
        int[] intArray = {-2147483647, 2147483646, 5318008, 58008}; 
        long[] longArray = {Long.MIN_VALUE, Long.MAX_VALUE, 0}; //I keep getting Kellam_320Asgmt10.java:74: error: integer number too large errors when I use this: long[] longArray = {-9223372036854775808, 9223372036854775807, 0};  hypothetically it should work, so I switched to what you see and it prints the numbers that it says is too large...WHY?!?!?
        double[] doubleArray = {0.1134, 1.2245, 2.3356, 3.4467, 4.5578};

        System.out.println("Short Array: " + Arrays.toString(shortArray));
        System.out.println("This array's average is: " + average(shortArray)); 
        // the true average is 491.2  But because it is not a float/double the remainder is dropped, not rounded, so the output is 491

        System.out.println("Int Array: " + Arrays.toString(intArray));
        System.out.println("This array's average is: " + average(intArray)); 
        // the average is 1344003.75  But because it is not a float/double the remainder is dropped, not rounded, so the output is 1344003

        System.out.println("Long Array: " + Arrays.toString(longArray));
        System.out.println("This array's average is: " + average(longArray));
        // the average is -.3333333333333333  But because it is not a float/double the remainder is dropped, not rounded, so the output is 0

        System.out.println("Double Array: " + Arrays.toString(doubleArray));
        System.out.println("This array's average is: " + average(doubleArray));
        // Finally! We see an average that keeps its decimal values...well, at least 16 of them.
    }
}