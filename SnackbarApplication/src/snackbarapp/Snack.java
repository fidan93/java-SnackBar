package snackbarapp;

public class Snack{

    private static int maxId = 0;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vmachineId;

    public Snack(String name, int quantity,double cost, int vmachineId)
    {
        maxId++;
        id = maxId;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vmachineId = vmachineId;
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

    public int getVmachineid()
    {
         return vmachineId;
    }
    public void setVmachineid(int vmachineId)
    {
        this.vmachineId = vmachineId;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void addQuantity(int quantity)
    {
        this.quantity = this.quantity + quantity;
    }

    public double buySnack(int quantity)
    {
        this.quantity = this.quantity - quantity;
        return this.cost * quantity;
    }

   
}