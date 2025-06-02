package Factory;

import Factory.components.button.Button;
import Factory.components.dropdown.DropDown;
import Factory.components.menu.Menu;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter(SupportedPlatform.WINDOWS);
        UIFactory uiFactory = flutter.createUIFactory();
        Menu menu = uiFactory.createMenu();
        DropDown dropDown = uiFactory.createDropDown();
        Button button = uiFactory.createButton();
    }
}
// Add a new platform -> MacOS
// Enum -> SupportedPlatform add MacOs
// Create components
//      Create the new classes implementing the parent interfaces
// Create MacOS ui factory implement UIFactory
// update the switch case
