package patterns.factory;

import enums.PizzaType;
import patterns.factory.factory.ChPizzaFactory;
import patterns.factory.factory.NyPizzaFactory;

/**
 * Created by User on 30.05.2016.
 */
public class PizzaMain {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new PizzaStore(new NyPizzaFactory());
        nyPizzaStore.order(PizzaType.CHEESE);

        PizzaStore chPizzaStore = new PizzaStore(new ChPizzaFactory());
        chPizzaStore.order(PizzaType.MEAT);
    }
}
