package strategypattern.behaviors;

/**
 * Created by sayghosh on 7/20/14.
 */
public class FlyNoWay implements IFlyBehavior {
    @Override
    public void fly() {
        System.out.println("I cannot fly");
    }
}
