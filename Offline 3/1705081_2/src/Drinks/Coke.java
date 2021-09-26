package Drinks;

public class Coke implements Drinks {
    private double price=40;
    @Override
    public double getDrinks() {
        System.out.println("Drinks-Coke");
        return price;
    }

}
