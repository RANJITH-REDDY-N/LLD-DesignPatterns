package Factory.ClientService;

import Factory.Flutter.Components.Button.Button;
import Factory.Flutter.Components.DropDown.DropDown;
import Factory.Flutter.Components.Input.Input;
import Factory.Flutter.Components.Menu.Menu;
import Factory.Flutter.Flutter;
import Factory.Flutter.SupportedPlatform;
import Factory.UIFactory.CommonUIFactory;
import Factory.UIFactory.UIFactory;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter(SupportedPlatform.IOS);
        UIFactory uiFactory = flutter.createUIFactory();

        Button button = uiFactory.createButton();
        Menu menu = uiFactory.createMenu();
        Input input = uiFactory.createInput();
        DropDown dropDown = uiFactory.createDropDown();
        System.out.println(button +"\n"+input+"\n"+menu+"\n"+dropDown);
        CommonUIFactory.setTheme();
        CommonUIFactory.setReferenceRate();
    }
}
