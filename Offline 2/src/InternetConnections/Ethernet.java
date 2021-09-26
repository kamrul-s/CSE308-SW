package InternetConnections;

public class Ethernet implements InternetConnection {
    @Override
    public String getInternetConnection() {
        System.out.println("InternetConnection:Ethernet");
        return "Ethernet";
    }
}
