package patterns.decorator;

/**
 * Created by User on 12.04.2016.
 */
public class Cream extends BeverageDecorator{
    public Cream(Beverage beverage){
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.description();
    }

    @Override
    public int cost() {
        return super.cost();
    }
}
