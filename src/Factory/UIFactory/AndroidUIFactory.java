package Factory.UIFactory;

import Factory.Flutter.Components.Button.AndroidButton;
import Factory.Flutter.Components.DropDown.AndroidDropDown;
import Factory.Flutter.Components.Input.AndroidInput;
import Factory.Flutter.Components.Menu.AndroidMenu;

public class AndroidUIFactory implements UIFactory{
    @Override
    public AndroidButton createButton() {
        return new AndroidButton();
    }

    @Override
    public AndroidMenu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public AndroidDropDown createDropDown() {
        return new AndroidDropDown();
    }

    @Override
    public AndroidInput createInput() {
        return new AndroidInput();
    }
}
