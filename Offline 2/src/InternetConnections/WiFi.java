package InternetConnections;

import InternetConnections.InternetConnection;

public class WiFi implements InternetConnection {
    @Override
    public String getInternetConnection() {
        System.out.println("InternetConnection:WiFi");
        return "WiFi";
    }
}
