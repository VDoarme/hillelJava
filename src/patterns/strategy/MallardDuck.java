package patterns.strategy;

import patterns.strategy.quack.Quack;
import patterns.strategy.quack.QuackBehavior;

/**
 * Created by User on 15.03.2016.
 */
public class MallardDuck extends Duck{

    QuackBehavior quackBehavior = new Quack();

    @Override
    public void display(){
        System.out.println("mallard duck");
    }
}
