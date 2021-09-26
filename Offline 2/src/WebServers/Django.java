package WebServers;

public class Django implements WebServer {
    @Override
    public String getWebserver() {
        System.out.println("Webserver:Django");
        return "Django";
    }
}
