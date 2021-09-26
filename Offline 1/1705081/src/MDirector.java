public class MDirector extends Officer{
    public MDirector(String nam, Bank empbank) {
        super(nam, empbank);
    }
    public void Changepct(String type, double newInt){
        type=type.toLowerCase();
        empbank.changeInterest(type,newInt);
        System.out.println("Interest Changed");
    }
    public void SeeIntFunds(){
        System.out.println("The internal funds are:"+empbank.getIntfunds()+"$");
    }
}
