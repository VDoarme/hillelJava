package patterns.factory;

import patterns.factory.pizza.Pizza;
import patterns.factory.factory.PizzaFactory;

/**
 * Created by User on 30.05.2016.
 */
public class PizzaStore {
    PizzaFactory pizzaFactory;

    public PizzaStore(PizzaFactory pizzaFactory){
        this.pizzaFactory = pizzaFactory;
    }

    public Pizza order(String type) {

        Pizza pizza = pizzaFactory.createPizza(type) ;

        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

   /* private Pizza createPizza(String region, String type) {
        if (region.equals("CH")) {
            switch (type) {
                case "Cheese":
                    new ChikagoCheesePizza();
                case "Meat":
                    new ChikagoMeatPizza();
                    break;
                default:
                    throw new RuntimeException("unexpected pizza type. " +
                            "Expected 'Meat', 'Cheese', but found: " + type);
            }
        } else if (region.equals("NY")) {
            switch (type) {
                case "Cheese":
                    new NewYorkCheesePizza();
                    break;
                case "Meat":
                    new NewYorkMeatPizza();
                default:
                    throw new RuntimeException("unexpected pizza type. " +
                            "Expected 'Meat', 'Cheese', but found: " + type);
            }
        } else {
            throw new RuntimeException("unexpected pizza type. " +
                    "Expected 'Meat', 'Cheese', but found: " + type);
        }
    }
}
*/
}
