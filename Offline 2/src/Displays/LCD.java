package Displays;

import Displays.Display;

public class LCD implements Display {
    @Override
    public String getDisplay() {
        System.out.println("Display:LCD");
        return "LCD";
    }
}
