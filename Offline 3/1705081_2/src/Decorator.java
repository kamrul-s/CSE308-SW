import Pizza.Pizza;

public abstract class Decorator implements Pizza {
    protected Pizza decoraterPizza;
    public Decorator(Pizza decor){
        decoraterPizza=decor;
    }

    @Override
    public double getPizza() {
        return decoraterPizza.getPizza();
    }
}
