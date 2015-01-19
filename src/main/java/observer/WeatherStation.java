package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sayghosh
 *
 */
public class WeatherStation {
    public static void main(String[] args) {
        List<Observer> observers = new ArrayList<Observer>();
        WeatherData s = new WeatherData();
        
        Observer o = new CurrentConditionsDisplay(s);
        s.setMeasurements(100, 100, 200);
    }
}
