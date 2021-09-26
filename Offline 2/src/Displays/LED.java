package Displays;

import Displays.Display;

public class LED implements Display {
    @Override
    public String getDisplay() {
        System.out.println("Display:LED");
        return "LED";
    }
}
