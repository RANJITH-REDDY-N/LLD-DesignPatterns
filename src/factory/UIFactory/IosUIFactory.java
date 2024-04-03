package factory.UIFactory;

import factory.Flutter.Components.Button.IosButton;
import factory.Flutter.Components.DropDown.IosDropDown;
import factory.Flutter.Components.Input.IosInput;
import factory.Flutter.Components.Menu.IosMenu;

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
