package Factory.UIFactory;

import Factory.Flutter.Components.Button.MacButton;
import Factory.Flutter.Components.DropDown.MacDropDown;
import Factory.Flutter.Components.Input.MacInput;
import Factory.Flutter.Components.Menu.MacMenu;

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
