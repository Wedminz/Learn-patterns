package creational_patterns.abstractfactory.factories;

import creational_patterns.abstractfactory.buttons.Button;
import creational_patterns.abstractfactory.checkboxes.Checkbox;

/**
 * Абстрактная фабрика знает обо всех (абстрактных) типах продуктов.
 */

public interface GUIFactory {
    public abstract Button createButton();
    public abstract Checkbox createCheckbox();
}
