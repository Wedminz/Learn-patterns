package creational_patterns.builders.builders;

import creational_patterns.builders.cars.Type;
import creational_patterns.builders.components.Engine;
import creational_patterns.builders.components.GPSNavigator;
import creational_patterns.builders.components.Transmission;
import creational_patterns.builders.components.TripComputer;

/**
 * Интерфейс Строителя объявляет все возможные этапы и шаги конфигурации
 * продукта.
 */

public interface Builder {
    public void setType(Type type);
    public void setSeats(int seats);
    public void setEngine(Engine engine);
    public void setTransmission(Transmission transmission);
    public void setTripComputer(TripComputer tripComputer);
    public void setGPSNavigator(GPSNavigator gpsNavigator);
}
