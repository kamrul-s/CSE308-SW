public class Cashier {
    protected String name;
    protected Bank empbank;
    public Cashier(String nam,Bank empbank){
        this.name=nam;
        this.empbank=empbank;

    }
    public void lookup(String nam){
        Customer temp=empbank.getCustomer(nam);
        if(temp==null){
            System.out.println("No customer with this name!");
            return;
        }
        System.out.println(nam+"'s current balance"+temp.getBalance()+"$");
    }
    public void Changepct(String type, double newInt){
        System.out.println("You don’t have permission for this operation");
    }
    public void SeeIntFunds(){
        System.out.println("You don’t have permission for this operation");
    }
    public void Approveloan(){
        System.out.println("You don’t have permission for this operation");
    }
}
