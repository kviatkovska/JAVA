package builder.example.builders;

import builder.example.cars.Type;
import builder.example.components.Engine;
import builder.example.components.GPSNavigator;
import builder.example.components.Transmission;
import builder.example.components.TripComputer;


public interface Builder {
    void setType(Type type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}