package Factory.UIFactory;

import Factory.Flutter.Components.Button.IosButton;
import Factory.Flutter.Components.DropDown.IosDropDown;
import Factory.Flutter.Components.Input.IosInput;
import Factory.Flutter.Components.Menu.IosMenu;

public class IosUIFactory implements UIFactory{
    @Override
    public IosButton createButton() {
        return new IosButton();
    }

    @Override
    public IosMenu createMenu() {
        return new IosMenu();
    }

    @Override
    public IosDropDown createDropDown() {
        return new IosDropDown();
    }

    @Override
    public IosInput createInput() {
        return new IosInput();
    }
}
