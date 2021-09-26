package Controllers;

public class ButtonController implements Controller {
    @Override
    public String getController() {
        System.out.println("Controllers:Button Controller");
        return "Button Controller";
    }
}
