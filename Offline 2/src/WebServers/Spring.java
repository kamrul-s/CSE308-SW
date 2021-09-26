package WebServers;

public class Spring implements WebServer {
    @Override
    public String getWebserver() {
        System.out.println("Webserver:Spring");
        return "Spring";
    }

}
