package Drinks;

public class Coffee implements Drinks {
    private double price=80;
    @Override
    public double getDrinks() {
        System.out.println("Drinks-Coffee");
        return price;
    }

}
