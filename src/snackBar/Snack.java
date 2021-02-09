package snackBar;

public class Snack
{
	private static int maxId = 0;
	private int id;
	private String name;
	private int quantity;
	private double cost;
	private String vendingMachine;

	public Snack(String name, int quantity,double cost, String vendingMachine)
{
	maxId++;
	id = maxId;
	this.name = name;
	this.quantity = quantity;
	this.cost = cost;
	this.vendingMachine = vendingMachine;
}
	public int getId()
	{
		return id;
	}

	public String getName()
	{
     return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public double getCost()
	{
     return cost;
	}

	public void setCost(double cost) 
	{
		this.cost = cost;
	}

	public String getVendingMachine()
	{
     return vendingMachine;
	}

	public void setVendingMachineId(String vendingMachine) 
	{
		this.vendingMachine = vendingMachine;
	}

	public int getQuantity()
	{
		return quantity;
	}

	public int addQuantity(int toAdd)
	{
		return quantity = quantity + toAdd;
	}

	public int buySnack(int toBuy)
	{
       return this.quantity = this.quantity - toBuy;
	}

	public double getTotalCost(int countToBuy)
	{
	   buySnack(countToBuy);
       return countToBuy * cost;
	}

		@Override 
	public String toString()
	{
		String tmpString = "Snack: " + "id: " + id + "name " + name + "quantity: " + quantity + "cost "+ cost + "vendingMachine " + vendingMachine;
		return tmpString;
	}
}