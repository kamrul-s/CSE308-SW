package Pizza;

public class BeefPizza implements Pizza {
    private double price=540;
    @Override
    public double getPizza() {
        System.out.println("Pizza-Beef Pizza");
        return price;
    }
}
