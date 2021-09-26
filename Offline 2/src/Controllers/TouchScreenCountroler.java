package Controllers;

import Controllers.Controller;

public class TouchScreenCountroler implements Controller {
    @Override
    public String getController() {
        System.out.println("Controller:Touch Screen Controller");
        return "Touch Screen";
    }
}
