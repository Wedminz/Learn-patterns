package creational_patterns.abstractfactory;

import creational_patterns.abstractfactory.app.Application;
import creational_patterns.abstractfactory.factories.GUIFactory;
import creational_patterns.abstractfactory.factories.MacOSFactory;
import creational_patterns.abstractfactory.factories.WindowsFactory;

/**
 * Приложение выбирает тип и создаёт конкретные фабрики динамически исходя
 * из конфигурации или окружения.
 */

public class Demo {

    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
            app = new Application(factory);
        } else {
            factory = new WindowsFactory();
            app = new Application(factory);
        }
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
