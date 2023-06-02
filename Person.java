

public class Person {
    public static void main(String[] args) {
        // Create a new Person object with a name
        Person person1 = new Person("John Doe");

        // Set the age of person1 using the setter method
        person1.setAge(25);

        // Retrieve the name and age of person1 using the getter methods
        String name = person1.getName();
        int age = person1.getAge();

        // Print the name and age
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        // Create another Person object with a name and age
        Person person2 = new Person("Jane Smith", 30);

        // Retrieve the name and age of person2 using the getter methods
        String name2 = person2.getName();
        int age2 = person2.getAge();

        // Print the name and age
        System.out.println("Name: " + name2);
        System.out.println("Age: " + age2);
    }
    
    private String name;
    private int age;
    public Person(String name) {
        this(name, 0); // Calls the constructor with name and default age
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Getter for name
    public String getName() {
        return name;
    }
    
    // Setter for name
    public void setName(String name) {
        this.name = name;
    }
    
    // Getter for age
    public int getAge() {
        return age;
    }
    
    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }
}
