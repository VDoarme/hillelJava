package patterns.decorator;

/**
 * Created by Valiage on 19.04.2016.
 */
public class Robusta implements Beverage {
    @Override
    public int cost() {
        return 13;
    }

    @Override
    public String description() {
        return "Robusta coffee ";
    }
}