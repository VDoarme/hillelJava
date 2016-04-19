package patterns.decorator;

/**
 * Created by Valiage on 19.04.2016.
 */
public class Houseblend implements Beverage {
    @Override
    public int cost() {
        return 10;
    }

    @Override
    public String description() {
        return "Houseblend coffe ";
    }
}