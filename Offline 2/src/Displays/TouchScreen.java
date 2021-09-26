package Displays;

import Displays.Display;

public class TouchScreen implements Display {
    @Override
    public String getDisplay() {
        System.out.println("Display:Touch screen Display");
        return "Touch Screen";
    }
}
