package strategypattern.behaviors;

/**
 * Created by sayghosh on 7/20/14.
 */
public class QuackLoud implements IQuackBehavior {
    @Override
    public void quack() {
        System.out.println("I quack loudly");
    }
}
