package Appetizer;

public class OnionRings implements Appetizer {
    private double price=100;
    @Override
    public double getAppertizer() {
        System.out.println("Appetizer-Onion Rings");
        return price;
    }
    
}
