package creational_patterns.abstractfactory.factories;

import creational_patterns.abstractfactory.buttons.Button;
import creational_patterns.abstractfactory.buttons.MacOSButton;
import creational_patterns.abstractfactory.checkboxes.Checkbox;
import creational_patterns.abstractfactory.checkboxes.MacOSCheckbox;

/**
 * Каждая конкретная фабрика знает и создаёт только продукты своей вариации.
 */

public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
