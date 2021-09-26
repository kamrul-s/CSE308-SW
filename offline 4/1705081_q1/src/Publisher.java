import java.util.*;

public class Publisher {
    private List<Subscriber> subscribers = new ArrayList<Subscriber>();
    public void addSubscreiber(Subscriber t){
        subscribers.add(t);
    }
    public void removeSubscriber(Subscriber t){
        subscribers.remove(t);
    }
    public void notifyAllSubscriber(){
        for (Subscriber s : subscribers) {
            s.notified();
        }
    }
}
