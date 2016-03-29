package patterns.observer;

/**
 * Created by User on 29.03.2016.
 */
public class WeatherStation {

    private int temperature;
    private int humidity;
    private int pressure;

    private CurrentDisplay currentDisplay = new CurrentDisplay();
    private StatisticDisplay statisticDisplay = new StatisticDisplay();
    private ForecastDisplay forecastDisplay = new ForecastDisplay();

    public void stateChanged(){
        currentDisplay.update(temperature,humidity,pressure);
        statisticDisplay.update(temperature,humidity,pressure);
        forecastDisplay.update(temperature,humidity,pressure);

        currentDisplay.display();
        statisticDisplay.dispay();
        forecastDisplay.display();

    }

    public int getHumidity() {
        return humidity;
    }

    public int getPressure() {
        return pressure;
    }

    public int getTemperature() {

        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }
}
