/*
 * CSD 405
 * Module 2 Assignment
 * Jeremiah Kellam
 * 1/21/2024
 * 
 * This is the program I wrote for the class before I had to withdraw due to a family medical emergency.
 * If there is an issue using my work, please let me know.  
 * 
 * Starting with your code from Module 1 create the following new class titled UseFans:
 *     Create a collection of Fan instances. =DONE
 *     Create a method taking a collection of Fan instances for displaying without using the toString() method. =DONE
 *     Create a method that takes a single instance of a Fan for displaying without using the toString() method. =DONE
 *     Use the this reference throughout the Fan class where allowed. =DONE
 *     Write test code that creates a collection of fans and displays the functionality of all of the Fan instances in the collection. =DONE
 * 
 * Citations:
 * 
 * Programming with Mosh. (2022, March 1). Java Collections Tutorial [Video]. YouTube. 
 *      https://www.youtube.com/watch?v=rH0winlka8A
 * Collections (Java Platform SE 8 ). (2023, April 5). 
 *      https://docs.oracle.com/javase/8/docs/api/java/util/Collections.html
 */

import java.util.ArrayList;
import java.util.Collection;

 public class Kellam_405Asgmt2{

    public static void main(String[] args) {
        UseFans useFans = new UseFans();    

        Collection<Fan> fans = new ArrayList<>();
        fans.add(new Fan());
        fans.add(new Fan(Fan.MEDIUM, true, 8, "blue"));
        useFans.displayfans(fans);

        Fan fan = new Fan(Fan.FAST, true, 10, "red");
        useFans.displayFan(fan);
    }
}

 class UseFans {
    public void displayfans(Collection<Fan> fans) {
        for (Fan fan : fans) {
            displayFan(fan);
        }
    }

    public void displayFan(Fan fan) {
        // Display the fan's state without using toString()
        System.out.println("Fan Values: [state=" + (fan.isOn() ? "on" : "off") + ", speed=" +
                fan.getSpeed() + ", radius=" + fan.getRadius() + ", color=" + fan.getColor() + "]");
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
}