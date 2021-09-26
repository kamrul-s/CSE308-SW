import Appetizer.FrenchFries;
import Appetizer.OnionRings;
import Pizza.Pizza;
import Pizza.VeggiPizza;
import Pizza.BeefPizza;
import Drinks.Coffee;
import Drinks.Coke;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true){
            Scanner sc=new Scanner(System.in);
            System.out.println("1. Beef Pizza with French fry\n" +
                    "2. Veggi Pizza with onion rings\n" +
                    "3. A combo meal with Veggi Pizza, French Fry and Coke\n" +
                    "4. A combo meal with Veggi Pizza, Onion Rings and Coffee\n" +
                    "5. A Beef Pizza only\n"+
                    "6.Exit");
            System.out.println("Enter your choice");
            int ch=sc.nextInt();
            sc.nextLine();
            Pizza x=null;
            if(ch==1){
                x=new FinalDecor(new BeefPizza(),new FrenchFries(),null);
            }
            else if(ch==2){
                x=new FinalDecor(new VeggiPizza(),new OnionRings(),null);
            }
            else if(ch==3){
                x=new FinalDecor(new VeggiPizza(),new FrenchFries(),new Coke());
            }
            else if(ch==4){
                x=new FinalDecor(new VeggiPizza(),new OnionRings(),new Coffee());
            }
            else if(ch==5){
                x=new BeefPizza();
            }
            else if(ch==6)break;
            if(ch>=0&&ch<6){
                double cost=x.getPizza();
                System.out.println("Total Cost "+cost+" Taka");
                System.out.println();
                //break;
            }
        }
    }
}
