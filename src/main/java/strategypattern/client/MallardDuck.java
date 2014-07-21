package strategypattern.client;

import strategypattern.behaviors.FlyWithWings;
import strategypattern.behaviors.QuackLoud;

/**
 * Created by sayghosh on 7/20/14.
 */
public class MallardDuck extends Duck {
    public MallardDuck() {
        //set the quack behavior and the fly behavior of mallard duck at compile time.
        // Here we are coding to the implementation and not the interface, which will
        // be the source of the next design pattern inversion of control. The Mallard
        // Duck class has to depend on the implementations of the behaviors.
        this.quackBehavior = new QuackLoud();
        this.flyBehavior = new FlyWithWings();
    }

    //Overriding methods of a super class Ctrl + O
    @Override
    public void display() {
        System.out.println("I am a Mallard Duck");
    }
}
