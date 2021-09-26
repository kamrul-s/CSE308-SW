package Appetizer;

public class FrenchFries implements Appetizer {
    private double price=100;
    @Override
    public double getAppertizer() {
        System.out.println("Appetizer-French Fries");
        return price;
    }


}
