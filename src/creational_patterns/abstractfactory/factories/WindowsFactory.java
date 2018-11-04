package creational_patterns.abstractfactory.factories;

import creational_patterns.abstractfactory.buttons.Button;
import creational_patterns.abstractfactory.buttons.WindowsButton;
import creational_patterns.abstractfactory.checkboxes.Checkbox;
import creational_patterns.abstractfactory.checkboxes.WindowsCheckbox;


/**
 * Каждая конкретная фабрика знает и создаёт только продукты своей вариации.
 */

public class WindowsFactory implements  GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
