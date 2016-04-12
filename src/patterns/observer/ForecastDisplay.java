package patterns.observer;

import java.util.Random;

/**
 * Created by User on 29.03.2016.
 */
public class ForecastDisplay implements Observer{

    private int temperature;
    private int humidity;
    private int pressure;
    private Random random = new Random();

    @Override
    public void update(WeatherStation station){
        this.temperature = station.getTemperature();
        this.humidity = randomize(humidity);
        this.pressure = randomize(pressure);
    }

    public void display(){
            System.out.println("temperature: " + temperature + ", humidity: " + humidity + ", pressure: " + pressure);
    }

    private int randomize(int value) {
        double seed = random.nextDouble() / 5 + 0.9;
        return (int) (value * seed);
    }
}
