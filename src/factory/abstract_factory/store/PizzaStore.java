package factory.abstract_factory.store;

import factory.abstract_factory.pizza.Pizza;

/**
 * Created by Rick on 2017/3/10.
 */
public abstract class PizzaStore {

    protected abstract Pizza createPizza(String type);

    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
