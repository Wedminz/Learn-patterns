package creational_patterns.factorymethod.factory;

import creational_patterns.factorymethod.buttons.Button;
import creational_patterns.factorymethod.buttons.HtmlButton;

/**
 * HTML-диалог.
 */

public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
