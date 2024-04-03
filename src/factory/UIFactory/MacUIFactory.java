package factory.UIFactory;

import factory.Flutter.Components.Button.MacButton;
import factory.Flutter.Components.DropDown.MacDropDown;
import factory.Flutter.Components.Input.MacInput;
import factory.Flutter.Components.Menu.MacMenu;

public class MacUIFactory implements UIFactory{
    @Override
    public MacButton createButton() {
        return new MacButton();
    }

    @Override
    public MacMenu createMenu() {
        return new MacMenu();
    }

    @Override
    public MacDropDown createDropDown() {
        return new MacDropDown();
    }

    @Override
    public MacInput createInput() {
        return new MacInput();
    }
}
