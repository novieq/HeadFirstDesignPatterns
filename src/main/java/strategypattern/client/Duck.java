package strategypattern.client;

import strategypattern.behaviors.IFlyBehavior;
import strategypattern.behaviors.IQuackBehavior;

/**
 * Created by sayghosh on 7/20/14.
 */
public abstract class Duck {
    public Duck() {

    }

    IFlyBehavior flyBehavior;
    IQuackBehavior quackBehavior;

    public void fly() {
        flyBehavior.fly();
    }

    public void quack() {
        quackBehavior.quack();
    }

    public void display() {

    }

    public void swim() {
        System.out.println("I am the unchanging part of the Duck class. I can swim.");
    }
}
