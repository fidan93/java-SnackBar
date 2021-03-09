package snackbarapp;

public class Main
{

    public static void main(String[] args)
    {
        Customer c1 = new Customer("Jane",45.25);
        Customer c2 = new Customer("Bob",33.14);

        VendingMachine v1 = new VendingMachine("Food");
        VendingMachine v2 = new VendingMachine("Drink");
        VendingMachine v3 = new VendingMachine("Office");

// public Snack(String name, int quantity,double cost, int vmachineId)
        Snack s1 = new Snack("Chips",36,1.75,v1.getId());
        Snack s2 = new Snack("Chocolate", 36, 1.00, v1.getId());
        Snack s3 = new Snack("Pretzel", 30, 2.00,v1.getId());
        Snack s4 = new Snack("Soda",24,2.50,v2.getId());
        Snack s5 = new Snack("Water",20, 2.75, v2.getId());

        c1.buySnacks(s4.buySnack(3));
        System.out.println(c1.getName() + " cash on hand $" + c1.getCashOnHand());
        System.out.println("Quantity of " + s4.getName() + " is " + s4.getQuantity());


        c1.buySnacks(s3.buySnack(1));
        System.out.println(c1.getName() + " cash on hand $" + c1.getCashOnHand());
        System.out.println("Quantity of " + s3.getName() + " is " + s3.getQuantity());


        c2.buySnacks(s4.buySnack(2));
        System.out.println(c2.getName() + " cash on hand $" + c2.getCashOnHand());
        System.out.println("Quantity of " + s4.getName() + " is " + s4.getQuantity());


        c1.addCash(10);
        System.out.println(c1.getName() + " cash on hand $" + c1.getCashOnHand());
        

        c1.buySnacks(s2.buySnack(1));
        System.out.println(c1.getName() + " cash on hand $" + c1.getCashOnHand());
        System.out.println("Quantity of " + s2.getName() + " is " + s2.getQuantity());

        s3.addQuantity(12);
        System.out.println("Quantity of " + s3.getName() + " is " + s3.getQuantity());

        c2.buySnacks(s3.buySnack(3));
        System.out.println(c2.getName() + " cash on hand $" + c2.getCashOnHand());
        System.out.println("Quantity of " + s3.getName() + " is " + s3.getQuantity());


    }

}

//  javac snackbarapp/*.java
//  jar cvfe snackbarApp.jar snackbarapp.Main snackbarapp/*.class
//  java -jar snackbarApp.jar
