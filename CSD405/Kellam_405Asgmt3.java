/*
 * Jeremiah Kellam
 * CSD 405
 * Module 3 Assignment
 * 6/6/2023
 */
public class Kellam_405Asgmt3 {
    public static void main(String[] args) {
        JeremiahInteger num1 = new JeremiahInteger(17);
        JeremiahInteger num2 = new JeremiahInteger(1984);
        JeremiahInteger num3 = new JeremiahInteger(99);

        System.out.println(num1.isEven());        // Should be false
        System.out.println(num1.isOdd());         // Should be true
        System.out.println(num1.isPrime());       // Should be true
        System.out.println("");

        System.out.println(num2.isEven());        // Should be true
        System.out.println(num2.isOdd());         // Should be false
        System.out.println(num2.isPrime());       // Should be false
        System.out.println("");
        
        System.out.println(num3.isEven());        // Should be false
        System.out.println(num3.isOdd());         // Should be true
        System.out.println(num3.isPrime());       // Should be false
        System.out.println("");
        
        System.out.println(JeremiahInteger.isEven(6));     // true
        System.out.println(JeremiahInteger.isOdd(6));      // false
        System.out.println(JeremiahInteger.isPrime(6));    // false
        System.out.println("");
        
        System.out.println(JeremiahInteger.isEven(Integer.valueOf(2)));    // true
        System.out.println(JeremiahInteger.isOdd(Integer.valueOf(2)));     // false
        System.out.println(JeremiahInteger.isPrime(Integer.valueOf(2)));   // true
        System.out.println("");
        
        System.out.println(num1.equals(17));                    //true
        System.out.println(num1.equals(Integer.valueOf(17)));     //true
        System.out.println(num1.equals(21));                    //false
        System.out.println(num1.equals(Integer.valueOf(21)));     //false
        System.out.println("");
        
        System.out.println(num2.equals(1984));                  //true
        System.out.println(num2.equals(Integer.valueOf(1984)));   //true
        System.out.println(num2.equals(21));                    //false
        System.out.println(num2.equals(Integer.valueOf(21)));     //false
        System.out.println("");
        
        System.out.println(num3.equals(99));                    //true
        System.out.println(num3.equals(Integer.valueOf(99)));     //true
        System.out.println(num3.equals(21));                    //false
        System.out.println(num3.equals(Integer.valueOf(21)));     //false
    }
}

class JeremiahInteger {
    private int value;

    public JeremiahInteger(int value) {
        this.value = value;
    }

    // Setter Getter methods
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    // Non-Static methods
    public boolean isEven() {
        return value % 2 == 0;
    }

    public boolean isOdd() {
        return value % 2 != 0;
    }

    public boolean isPrime() {
        if (value < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Static methods with int parameter
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isOdd(int num) {
        return num % 2 != 0;
    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Static methods with Integer parameter
    public static boolean isEven(Integer num) {
        return num % 2 == 0;
    }

    public static boolean isOdd(Integer num) {
        return num % 2 != 0;
    }

    public static boolean isPrime(Integer num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // equals methods
    public boolean equals(int num) {
        return value == num;
    }

    public boolean equals(Integer num) {
        return num.equals(value);
    }
}
