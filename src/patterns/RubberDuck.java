package patterns;

import patterns.fly.FlyNoWay;
import patterns.quack.QuackBehavior;
import patterns.quack.Squik;

/**
 * Created by User on 15.03.2016.
 */
public class RubberDuck extends Duck {

    public RubberDuck(){
        quackBehavior = (QuackBehavior) new Squik();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display(){
        System.out.println("Rubber duck");
    }

    @Override
    public void fly() {
        System.out.println("I can't fly");
    }


}
