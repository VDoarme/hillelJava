package patterns.strategy;

import patterns.strategy.fly.FlyBehavior;
import patterns.strategy.quack.QuackBehavior;

/**
 * Created by User on 15.03.2016.
 */
public abstract class Duck {

    QuackBehavior quackBehavior;

    FlyBehavior flyBehavior;

    public void fly(){}

    public void swim(){
        System.out.println("I'm swiming");
    }

    public void quack(){
       quackBehavior.quack();
    }

    public abstract void display();
}
