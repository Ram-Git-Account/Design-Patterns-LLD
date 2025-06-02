package Factory;

import Factory.components.button.Button;
import Factory.components.button.IOSButton;
import Factory.components.dropdown.DropDown;
import Factory.components.dropdown.IOSDropDown;
import Factory.components.menu.IOSMenu;
import Factory.components.menu.Menu;

public class IOSUIFactory implements UIFactory{
    //factory method for creating menu object
    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }
    //factory method for creating dropdown object
    @Override
    public DropDown createDropDown() {
        return new IOSDropDown();
    }
    //factory method for creating button object
    @Override
    public Button createButton() {
        return new IOSButton();
    }

}
