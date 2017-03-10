package factory.abstract_factory;

import factory.abstract_factory.pizza.Pizza;
import factory.abstract_factory.store.ChicagoPizzaStore;
import factory.abstract_factory.store.NYPizzaStore;

/**
 * Created by Rick on 2017/3/10.
 */
public class Test4AbstractFactory {

    public static void main(String[] args) {

        Pizza pizza = new NYPizzaStore().orderPizza("cheese");
        pizza = new NYPizzaStore().orderPizza("sauce");
        pizza = new NYPizzaStore().orderPizza("dough");

        pizza = new ChicagoPizzaStore().orderPizza("cheese");
        pizza = new ChicagoPizzaStore().orderPizza("sauce");
        pizza = new ChicagoPizzaStore().orderPizza("dough");
    }
}
