package strategypattern.main;

import strategypattern.client.Duck;
import strategypattern.client.MallardDuck;

/**
 * Created by sayghosh on 7/20/14.
 */
public class DuckSimulator {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.quack();
        duck.fly();
        duck.display();
        duck.swim();
        System.out.println("");
    }
}
