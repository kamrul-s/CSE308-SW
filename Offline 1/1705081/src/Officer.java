public class Officer extends Cashier {
    public Officer(String nam, Bank empbank) {
        super(nam, empbank);
    }
    public void Approveloan(){
        empbank.AproveloanBank();
        return;
    }
}
