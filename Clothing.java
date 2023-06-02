public class Clothing {
	String brand;
	String material;
	
	public void laundry() {
		System.out.println("The clothing is getting washed.");
	}
	
	public void outfit() {
		System.out.println("The clothing is being worn.");
    }
    
    public static void main(String[] args) {
        Clothing myPants = new Clothing();
            myPants.brand = "Levi";
            myPants.material = "denim";
        Clothing myShirt = new Clothing();
            myShirt.brand = "Carhart";
            myShirt.material = "cotton";
            myShirt.laundry();
            myShirt.outfit();
        System.out.println("My pants are made of " + myPants.material + ".");
        System.out.println("My shirt is a " + myShirt.brand + ".");
        
	}
}