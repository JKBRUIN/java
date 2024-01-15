/*
 * CSD 405
 * Module 1.2 Assignment
 * Jeremiah Kellam
 * 1/14/2024
 * 
 * This is the program I wrote for the class before I had to withdraw due to a family medical emergency.
 * If there is an issue using my work, please let me know.  
 * 
 * Write a JAVA program with a class titled Fan. This class is to contain:
 *     Four constants named STOPPED, SLOW, MEDIUM, and FAST. The constants are to hold the values of 0, 1, 2, and 3 respectively. =DONE
 *     A private field named speed that holds one of the constant values with the default being STOPPED. =DONE
 *     A private Boolean field titled on that specifies whether the fan is on or off. =DONE
 *     A private field named radius that holds the radius of the fan with a default value of 6.  =DONE
 *     A String field that holds the color, with the default being white. =DONE
 *     Setter and getter methods for all mutable fields. =DONE
 *     A no-argument constructor that sets all fields with a default value. =DONE
 *     A constructor taking arguments and setting values. =DONE
 *     Write a toString() method that returns a description of the Fans state. =DONE
 *     Write test code that creates two instances of the Fan class, one using the default constructor and the other using the argument constructor. =DONE
 *     Write code that displays the functionality of the Fan class methods. =DONE
 */

 public class Kellam_405Asgmt1{

   public static void main(String[] args) {
      
      Fan defaultFan = new Fan();
         System.out.println("Default Fan:");
         System.out.println(defaultFan); // Display the default fan's state using toString()

      Fan modifiedFan = new Fan(Fan.MEDIUM, true, 8, "blue");
         System.out.println("\nModified Fan:");
         System.out.println(modifiedFan); // Display the modified fan's state using toString()

         modifiedFan.setSpeed(Fan.SLOW);
         modifiedFan.setRadius(4.20);
         modifiedFan.setColor("green");
         
         System.out.println("\nModified Fan:");
         System.out.println(modifiedFan); // Display the newly .set modified fan's state using toString()

         modifiedFan.setSpeed(Fan.MEDIUM);
         modifiedFan.setRadius(6.9);
         modifiedFan.setColor("gold");
         
         System.out.println("\nModified Fan:");
         System.out.println(modifiedFan); // Display the newly .set modified fan's state using toString()

         modifiedFan.setSpeed(Fan.STOPPED);
         modifiedFan.setRadius(9.9);
         modifiedFan.setColor("black");
         
         System.out.println("\nModified Fan:");
         System.out.println(modifiedFan); // Display the newly .set modified fan's state using toString()

         modifiedFan.setSpeed(Fan.FAST);
         modifiedFan.setRadius(11);
         modifiedFan.setColor("lava red");
         
         System.out.println("\nModified Fan:");
         System.out.println(modifiedFan); // Display the newly .set modified fan's state using toString()

         System.out.println("\nDefault Fan:");
         System.out.println(defaultFan);
   }
 }

 class Fan{

   public static final int STOPPED = 0;
   public static final int SLOW = 1;
   public static final int MEDIUM = 2;
   public static final int FAST = 3;
   
   private int speed;
   private boolean on;
   private double radius;
   private String color;

   public Fan() {
      this.speed = STOPPED;
      this.on = false;
      this.radius = 6.0;
      this.color = "white";
  }

   public Fan(int speed, boolean on, double radius, String color) {
      this.speed = speed;
      this.on = (speed != STOPPED);
      this.radius = radius;
      this.color = color;
   }

   public int getSpeed() {
      return speed;
  }

  public void setSpeed(int speed) {
      this.speed = speed;
      this.on = (speed != STOPPED); 
  }

  public boolean isOn() {
      return on;
  }

  public void setOn(boolean on) {
      this.on = on;
      if (!on) {
         this.speed = STOPPED;
      }
  }

  public double getRadius() {
      return radius;
  }

  public void setRadius(double radius) {
      this.radius = radius;
  }

  public String getColor() {
      return color;
  }

  public void setColor(String color) {
      this.color = color;
  }


   public String toString() {
      return "Fan Values: [state=" + (on ? "on" : "off") + ", speed=" + speed + ", radius=" + radius + ", color=" + color + "]";
  }

 }