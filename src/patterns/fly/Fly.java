package patterns.fly;

/**
 * Created by User on 15.03.2016.
 */
public class Fly implements FlyBehavior {
    @Override
    public void fly(){
        System.out.println("I'm flying");
    }
}
