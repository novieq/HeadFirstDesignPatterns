package strategypattern.behaviors;

/**
 * Created by sayghosh on 7/20/14.
 */
public class FlyWithWings implements IFlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can fly with wings");
    }
}
