/*
 * Jeremiah Kellam
 * CSD 405
 * Module 6 Assignment
 * 2/4/2024
 * 
 * Create an abstract Division class =Done
 * with fields for:
 *      a company's division name =Done
 *      and account number, =Done
 *      and an abstract display() method that will be defined in the subclasses. =Done
 * Use a constructor in the superclass that requires values for both fields. =Done
 * Create two subclasses named InternationalDivision and DomesticDivision. =Done
 * The InternationalDivision class includes:
 *      a field for the country in which the division is located, =Done
 *      a field for the language spoken, =Done
 *      and a constructor that requires all fields when created. =Done
 * The DomesticDivision class includes 
 *      a field for the state in which the division is located =Done
 *      and a constructor that requires all fields when created. =Done
 * 
 * I CAN"T FIGURE THIS ONE OUT!!!
 * Write an application named UseDivision that creates two instances of each of these concrete classes (4 total instances).
 *  Save the files as: 
 *      Division
 *      InternationalDivision
 *      DomesticDivision
 *      UseDivision
 */

public class Kellam_405Asgmt6 {
    public static void main(String[] args) {
        System.out.println("I can't get this to run without a 'static' main(String[]) and can't figure it out. I do however have four classes created when I compile.  What am I missing?");
    }
    
    //Create an abstract Division class
    public abstract class Division {
        //private fields for variables
        private String divisionName;
        private String accountNumber;

        //constructor to initialize variables/requires values for both fields
        public Division(String divisionName, String accountNumber) {
            this.divisionName = divisionName;
            this.accountNumber = accountNumber;
        }

        //abstract display method
        public abstract void display();
        
        //static nested class extends abstract class
        public class InternationalDivision extends Division {
            //additional private variables
            private String country;
            private String languageSpoken;

            //constructor to initialize variables, requiring all fields including the inherited ones from Division
            public InternationalDivision(String divisionName, String accountNumber, String country, String languageSpoken) {
                super(divisionName, accountNumber);
                this.country = country;
                this.languageSpoken = languageSpoken;
            }

            //overrides display() method show details specific to international division
            @Override
            public void display() {
                System.out.println("International Division: " + super.divisionName);
                System.out.println("Account Number: " + super.accountNumber);
                System.out.println("Country: " + country);
                System.out.println("Language Spoken: " + languageSpoken);
                System.out.println();
            }
        }

        //class extends abstract class
        public class DomesticDivision extends Division {
            //different additional private variable
            private String state;

            //constructor to initialize variables, requiring all fields including the inherited ones from Division
            public DomesticDivision(String divisionName, String accountNumber, String state) {
                super(divisionName, accountNumber);
                this.state = state;
            }

            //overrides display() method show details specific to domestic division
            @Override
            public void display() {
                System.out.println("Domestic Division: " + super.divisionName);
                System.out.println("Account Number: " + super.accountNumber);
                System.out.println("State: " + state);
                System.out.println();
            }
        }

        public class UseDivision{
            //creates instances of Int/Dom Divisions
            public void main(String[] args) {
                InternationalDivision international1 = new InternationalDivision("South America", "INT001", "Brazil", "Portuguese");
                InternationalDivision international2 = new InternationalDivision("Eastern Europe", "INT002", "Ukraine", "Ukrainian");
                DomesticDivision domestic1 = new DomesticDivision("North Central", "DOM001", "Indiana");
                DomesticDivision domestic2 = new DomesticDivision("South Central", "DOM002", "Texas");

                international1.display();
                international2.display();
                domestic1.display();
                domestic2.display();
            }
        }
    }
}
