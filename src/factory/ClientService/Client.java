package factory.ClientService;

import factory.Flutter.Components.Button.Button;
import factory.Flutter.Components.DropDown.DropDown;
import factory.Flutter.Components.Input.Input;
import factory.Flutter.Components.Menu.Menu;
import factory.Flutter.Flutter;
import factory.Flutter.SupportedPlatform;
import factory.UIFactory.UIFactory;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter(SupportedPlatform.IOS);
        UIFactory uiFactory = flutter.createUIFactory();

        Flutter.setTheme();
        Flutter.setReferenceRate();
        Button button = uiFactory.createButton();
        Menu menu = uiFactory.createMenu();
        Input input = uiFactory.createInput();
        DropDown dropDown = uiFactory.createDropDown();
        System.out.println(button +"\n"+input+"\n"+menu+"\n"+dropDown);
    }
}
