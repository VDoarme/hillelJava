package patterns.observer;

/**
 * Created by User on 29.03.2016.
 */
public class WeatherStationMain {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();

        station.setTemperature(20);
        station.setHumidity(20);
        station.setPressure(20);
        station.stateChanged();

    }
}
