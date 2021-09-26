package InternetConnections;

public class GSM implements InternetConnection {
    @Override
    public String getInternetConnection() {
        System.out.println("InternetConnection:GSM");
        return "GSM";
    }
}
