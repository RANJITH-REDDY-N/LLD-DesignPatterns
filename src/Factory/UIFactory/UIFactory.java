package Factory.UIFactory;

import Factory.Flutter.Components.Button.Button;
import Factory.Flutter.Components.DropDown.DropDown;
import Factory.Flutter.Components.Input.Input;
import Factory.Flutter.Components.Menu.Menu;

public interface UIFactory {
    Button createButton();
    Menu createMenu();
    DropDown createDropDown();
    Input createInput();
}
