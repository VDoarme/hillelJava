package patterns.strategy.quack;

/**
 * Created by Valiage on 19.04.2016.
 */
public class Squick implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("squick");
    }
}