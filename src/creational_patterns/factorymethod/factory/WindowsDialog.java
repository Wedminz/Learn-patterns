package creational_patterns.factorymethod.factory;

import creational_patterns.factorymethod.buttons.Button;
import creational_patterns.factorymethod.buttons.WindowsButton;

public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
