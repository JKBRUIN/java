/*
 * References:
 * Duckademy IT courses. (2015, December 14). 
 * Java tutorial for complete beginners with interesting examples - Easy-to-follow Java programming [Video]. 
 * YouTube. https://www.youtube.com/watch?v=JPOzWljLYuU
 */

import java.util.Scanner;

/** CSD320
 * Module 2 Assignment 2
 * Jeremiah Kellam
 * 3/24/23
 * 
 * Assignment:
 * Write a program that calculates the energy needed to 
 * heat water from an initial temperature to a final temperature.
 * Your program should prompt the user to enter the amount of water 
 * in kilograms and the initial and final temperature of the water.
 * The formula to use for this program is:
 * Q = waterMass ( finalTemperature – initialTemperature ) x 4184
 * 
 * @author jskellam
 */
public class Kellam_Mod2Asgmt2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello! We will calculate the energy, in Joules,");
        System.out.println("that is required for the water sample to reach");
        System.out.println("your desired temperature, in degrees Celsius.");
        System.out.println("Please enter the initial temperature of the water,");
        System.out.println("in degrees Celsius:");
        Scanner scanner = new Scanner(System.in);
        double initialTemperature = scanner.nextDouble();
        System.out.println("You have entered " + initialTemperature + " degrees Celsius.");
        System.out.println("Please enter the final temperature that you want the water to achieve,");
        System.out.println("in degrees Celsius");
        double finalTemperature = scanner.nextDouble();
        System.out.println("You have entered " + finalTemperature + " degrees Celsius as your target temperature.");
        System.out.println("Please enter the mass of the water, in Kilograms");
        double waterMass = scanner.nextDouble(); 
        System.out.println("You have entered " + waterMass + "kg as the mass of the water.");
        System.out.println("The energy required for your water sample to reach the desired temperature:");
        float Q = (float) (waterMass * (finalTemperature - initialTemperature) * 4184);
        System.out.println(Q + " Joules");
        scanner.close();
    }
    
}
