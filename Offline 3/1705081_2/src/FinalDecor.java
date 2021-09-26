import Appetizer.Appetizer;
import Drinks.Drinks;
import Pizza.Pizza;

public class FinalDecor extends Decorator {
    Appetizer apr;
    Drinks drink;
    public FinalDecor(Pizza decor,Appetizer a,Drinks d){
        super(decor);
        apr=a;
        drink=d;
    }

    @Override
    public double getPizza() {
        double x=super.getPizza();
        x+=getAprPrize();
        x+=getDrinkPrize();
        //System.out.println("Total Cost "+x);
        return x;
    }
    public double getAprPrize(){
        if(apr==null) return 0;
        else return apr.getAppertizer();
    }
    public double getDrinkPrize(){
        if(drink==null) return 0;
        else return drink.getDrinks();
    }
}
