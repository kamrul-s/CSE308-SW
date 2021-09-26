package Pizza;

public class VeggiPizza implements Pizza {
    private double price=440;
    @Override
    public double getPizza() {
        System.out.println("Pizza-Vegetable Pizza");
        return price;
    }


}
