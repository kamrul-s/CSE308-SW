public class Subscriber {
    private int id;
    public Subscriber(int t){
        id=t;
    }
    public void notified(){
        System.out.println("Notified to "+id);
    }
}
