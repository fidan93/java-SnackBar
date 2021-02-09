package snackBar;

public class Main {

	private static void workWithData() 
	{
		System.out.println("It is working");

		Customer jane = new Customer("Jane",45.25);
		Customer bob = new Customer("Bob",33.14);

		VendingMachine food = new VendingMachine("Food");
		VendingMachine drink = new VendingMachine("Drink");
		VendingMachine office = new VendingMachine("Office");
//Snack(String name, int quantity,double cost, int vendingMachineId)
		Snack chips = new Snack("Chips", 36, 1.75, food.getName());
		Snack choc = new Snack("Chocolate Bar", 36, 1.00, food.getName());
		Snack pretzel = new Snack("Pretzel", 30, 2.00, food.getName());

		Snack soda = new Snack("Soda", 24, 2.50, drink.getName());
		Snack water = new Snack("Water", 20, 2.75, drink.getName());
// Customer 1 (Jane) buys 3 of snack 4 (Soda)
		jane.buySnacks(soda.getTotalCost(3));

		System.out.println(jane.getName() + " cash on hand $" + jane.getCashOnHand());
		System.out.println("Quantity of " + soda.getName() +" is " + soda.getQuantity());
// Customer 1 (Jane) buys 1 of snack 3 (Pretzel).
		jane.buySnacks(pretzel.getTotalCost(1));

		System.out.println(jane.getName() + " cash on hand $" + jane.getCashOnHand());
		System.out.println("Quantity of " + pretzel.getName() +" is " + pretzel.getQuantity());

// Customer 2 (Bob) buys 2 of snack 4 (Soda).
		bob.buySnacks(soda.getTotalCost(2));

		System.out.println(bob.getName() + " cash on hand $" + bob.getCashOnHand());
		System.out.println("Quantity of " + soda.getName() +" is " + soda.getQuantity());

//Customer 1 (Jane) finds $10.
		jane.addCash(10);
		System.out.println(jane.getName() + " cash on hand $" + jane.getCashOnHand());

//Customer 1 (Jane) buys 1 of snack 2 (Chocolate Bar).
        jane.buySnacks(choc.getTotalCost(1));

	    System.out.println(jane.getName() + " cash on hand $" + jane.getCashOnHand());
		System.out.println("Quantity of " + choc.getName() +" is " + choc.getQuantity());
//Add 12 more items to snack 3 (Pretzel).
		pretzel.addQuantity(12);
		System.out.println("Quantity of " + pretzel.getName() +" is " + pretzel.getQuantity());
// Customer 2 (Bob) buys 3 of snack 3 (Pretzel).
		bob.buySnacks(pretzel.getTotalCost(3));

		System.out.println(bob.getName() + " cash on hand $" + bob.getCashOnHand());
		System.out.println("Quantity of " + pretzel.getName() +" is " + pretzel.getQuantity());

		System.out.println("Snack: " + soda.getName() + '\n' + "VendingMachine: " + soda.getVendingMachine() + '\n' + "Quantity: " + soda.getQuantity() + '\n' + "Total cost: $" + (soda.getQuantity()*soda.getCost()));
		System.out.println("Snack: " + chips.getName() + '\n' + "VendingMachine: " + chips.getVendingMachine() + '\n' + "Quantity: " + chips.getQuantity() + '\n' + "Total cost: $" + (chips.getQuantity()*chips.getCost()));
		System.out.println("Snack: " + choc.getName() + '\n' + "VendingMachine: " + choc.getVendingMachine() + '\n' + "Quantity: " + choc.getQuantity() + '\n' + "Total cost: $" + (choc.getQuantity()*choc.getCost()));
		System.out.println("Snack: " + pretzel.getName() + '\n' + "VendingMachine: " + pretzel.getVendingMachine() + '\n' + "Quantity: " + pretzel.getQuantity() + '\n' + "Total cost: $" + (pretzel.getQuantity()*pretzel.getCost()));
		System.out.println("Snack: " + water.getName() + '\n' + "VendingMachine: " + water.getVendingMachine() + '\n' + "Quantity: " + water.getQuantity() + '\n' + "Total cost: $" + (water.getQuantity()*water.getCost()));
	}


	public static void main(String[] args)
	{
       workWithData();
	}
}
//javac snackBar/*.java
//jar cvfe snackBar.jar snackBar.Main snackBar/*.class
//java -jar snackBar.jar
