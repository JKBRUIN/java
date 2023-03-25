/** CSD320 
 * Module 1 Assignment:  Math with Numbers: integer Vs float
 * Jeremiah Kellam
 * 3/18/23
 * 
 * Assignment:
 * Write a program that displays the results of:
 *  4 * ( 1.0 - 1.0 / 3.0 + 1.0 / 5.0 - 1.0 / 7.0 + 1.0 / 9.0 - 1.0 / 11.0 + 1.0 / 13.0 )
 *  And
 *  4 * ( 1 - 1 / 3 + 1 / 5 - 1 / 7 + 1 / 9 - 1 / 11 + 1 / 13 )
 * In your comments, add a discussion on the difference between the two outputs
 * and the cause. Which is best? Why?
 * 
 * @author jskellam
 */
public class Kellam_Mod1Asgmt1 {
    public static void main(String[] args) {
        System.out.println("Here is an equation with float type variables being used: 4 * ( 1.0 - 1.0 / 3.0 + 1.0 / 5.0 - 1.0 / 7.0 + 1.0 / 9.0 - 1.0 / 11.0 + 1.0 / 13.0 )");
        System.out.print("Math with float type variables will result in a float type variable to be returned= ");
        System.out.println(4 * ( 1.0 - 1.0 / 3.0 + 1.0 / 5.0 - 1.0 / 7.0 + 1.0 / 9.0 - 1.0 / 11.0 + 1.0 / 13.0 ));
        System.out.println("Here is the same equation, only with integer type variables: 4 * ( 1 - 1 / 3 + 1 / 5 - 1 / 7 + 1 / 9 - 1 / 11 + 1 / 13 )");  
        System.out.print("Math with integer type variables will result in an integer type variable to be returned= ");
        System.out.println(4 * ( 1 - 1 / 3 + 1 / 5 - 1 / 7 + 1 / 9 - 1 / 11 + 1 / 13 ));   
        System.out.println("Math with integers will result in numbers being rounded down to the closest whole number");
        System.out.println("before the next internal operation will be carried out, example after division takes place: 4 * (1-0+0-0+0-0+0)");
        System.out.println("Math, especially with division, should be perfomed with float type variables for the most accurate results.");
        
    }
}