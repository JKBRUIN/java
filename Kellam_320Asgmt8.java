/*
 * CSD 320
 * Module 8 Assignment 8
 * Jeremiah Kellam
 * 4/23/2023
 * 
 * Assignment:
 * Write a program with four methods for calculating the cost of a yearly auto service visit. The methods will be titled yearlyService.
 *      yearlyService(no parameters) - Will return the standard service charge.
 *      yearlyService(one parameter) - Will return the standard service charge with an added oil change fee.
 *      yearlyService(two parameters) - Will return the standard service charge with an added oil change fee and a tire rotation charge.
 *      yearlyService(three parameters) - Will return the standard service charge with an added oil change fee, a tire rotation charge, along with a coupon amount that will be deducted from the total cost.
 * Write a main method that will test each of these methods two times.
 * 
 * Citations:
 * 
 * Alex Lee. (2019, October 3). Java Constructor Tutorial - Learn Constructors in Java [Video]. YouTube. 
 *      https://www.youtube.com/watch?v=G1Iln3PSrUg
 * 
 * Java Modifiers. (n.d.). 
 *      https://www.w3schools.com/java/java_modifiers.asp
 * 
 * Math and Science. (2018, March 28). Java Programming Tutorial 02 - Adding Parameters to a Method & Returning Values [Video]. YouTube. 
 *      https://www.youtube.com/watch?v=ih0wQ1nBkTA
 * 
 * Java Method Overloading. (n.d.). 
 *      https://www.w3schools.com/java/java_methods_overloading.asp
 * 
 * DecimalFormat (Java Platform SE 7 ). (2020, June 24). 
 *      https://docs.oracle.com/javase/7/docs/api/java/text/DecimalFormat.html
 * 
 */

 import java.text.DecimalFormat;

public class Kellam_320Asgmt8 {
    
    public static final double serviceCharge = 99.99;
    public static DecimalFormat df = new DecimalFormat("0.00");

    public static double yearlyService() {
        return serviceCharge;
    }
    public static double yearlyService(double oilChange) {
        return serviceCharge + oilChange;
    }
    public static double yearlyService(double oilChange, double tireRotation) {
        return serviceCharge + oilChange + tireRotation;
    }
    public static double yearlyService(double oilChange, double tireRotation, double couponValue) {
        return serviceCharge + oilChange + tireRotation - couponValue;
    }
    public static void main(String[] args) {
        System.out.println("Here are the various total costs of services when packaged together.");
        System.out.println("Standard service charge: $" + df.format(yearlyService()));
        System.out.println("Standard service charge with regular oil change fee: $" + df.format(yearlyService(39.99)));
        System.out.println("Standard service charge with regular oil change & stock tire rotation fees: $" + df.format(yearlyService(39.99, 59.99)));
        System.out.println("Standard service charge with regular oil change & stock tire rotation fees, \nincluding the basic coupon discount: $" + df.format(yearlyService(39.99, 59.99, 20.00)));
        System.out.println("Standard service charge: $" + df.format(yearlyService()));
        System.out.println("Standard service charge with premium oil change fee: $" + df.format(yearlyService(69.99)));
        System.out.println("Standard service charge with premium oil change & racing tire rotation fees: $" + df.format(yearlyService(69.99, 69.99)));
        System.out.println("Standard service charge with premium oil change & racing tire rotation fees, \nincluding the VIP membership coupon discount: $" + df.format(yearlyService(69.99, 69.99, 40.00)));
    }
}
