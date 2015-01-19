/**
 * @author sayghosh
 */
package observer;

/**
 * @author sayghosh
 *
 */
public class CurrentConditionsDisplay implements Observer, Display{

    Subject s;
    int temperature;
    int humidity;
    public CurrentConditionsDisplay(Subject w) {
        this.s = w;
        s.registerObserver(this); // there is no apparent reason for keeping a reference to the subject in the observer.
        //it just gives the observer the freedom to deregister from here.
    }
    /* (non-Javadoc)
     * @see observer.Observer#updateObserver(int, int, int)
     */
    @Override
    public void updateObserver(int temperature, int humidity, int pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    /* (non-Javadoc)
     * @see observer.Display#display()
     */
    @Override
    public void display() {
        System.out.println("The temperature is " + this.temperature + " and the humidity is " + this.humidity);
    }

}
