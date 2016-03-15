package patterns;

import patterns.quack.Quack;
import patterns.quack.QuackBehavior;

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
