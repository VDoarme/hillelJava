package patterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 29.03.2016.
 */
public class StatisticDisplay implements Observer{

    private List<Integer> temperatures = new ArrayList<Integer>();
    private List<Integer> humidities = new ArrayList<Integer>();
    private List<Integer> presures = new ArrayList<Integer>();

    @Override
    public void update(int temperature, int humidity, int pressure){
        temperatures.add(temperature);
        humidities.add(humidity);
        presures.add(pressure);
    }

    public void dispay(){
        System.out.println("temperatures: " + temperatures +
        ", humidities: " + humidities +
        ", pressures: " + presures);
    }
}
