/**
 * @author sayghosh
 */
package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sayghosh
 *
 */
public class WeatherData implements Subject {

    List<Observer> observers;
    int temperature;
    int humidity;
    int pressure;
    /**
     * @param observers
     */
    public WeatherData() {
        observers = new ArrayList<Observer>(10);
    }
    /* (non-Javadoc)
     * @see observer.Subject#registerObserver(observer.Observer)
     */
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    

    /* (non-Javadoc)
     * @see observer.Subject#removeObserver(observer.Observer)
     */
    @Override
    public void removeObserver(Observer o) {
        int index = observers.indexOf(o);
        observers.remove(index);
    }
    /* (non-Javadoc)
     * @see observer.Subject#notifyObserver()
     */
    @Override
    public void notifyObserver() {
        for(Observer o : observers) {
            o.updateObserver(this.temperature, this.humidity, this.pressure);
        }
    }
    
    public void setMeasurements(int t, int h, int p) {
        this.temperature = t;
        this.humidity = h;
        this.pressure = p;
        measurementsChanged();
    }
    public void measurementsChanged() {
        notifyObserver();
    }
}
