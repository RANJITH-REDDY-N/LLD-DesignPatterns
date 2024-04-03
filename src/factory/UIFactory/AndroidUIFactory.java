package factory.UIFactory;

import factory.Flutter.Components.Button.AndroidButton;
import factory.Flutter.Components.DropDown.AndroidDropDown;
import factory.Flutter.Components.Input.AndroidInput;
import factory.Flutter.Components.Menu.AndroidMenu;

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
