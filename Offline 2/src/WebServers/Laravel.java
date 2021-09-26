package WebServers;

public class Laravel implements WebServer {
    @Override
    public String getWebserver() {
        System.out.println("Webserver: Laravel");
        return "Laravel";
    }
}
