package factory.UIFactory;

import factory.Flutter.Components.Button.Button;
import factory.Flutter.Components.DropDown.DropDown;
import factory.Flutter.Components.Input.Input;
import factory.Flutter.Components.Menu.Menu;

public interface UIFactory {
    Button createButton();
    Menu createMenu();
    DropDown createDropDown();
    Input createInput();
}
