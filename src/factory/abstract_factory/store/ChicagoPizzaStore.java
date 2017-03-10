package factory.abstract_factory.store;

import factory.abstract_factory.factory.AbstractFactory;
import factory.abstract_factory.factory.ChicagoPizzaFactory;
import factory.abstract_factory.pizza.CheesePizza;
import factory.abstract_factory.pizza.DoughPizza;
import factory.abstract_factory.pizza.Pizza;
import factory.abstract_factory.pizza.SaucePizza;

/**
 * Created by Rick on 2017/3/10.
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;

        AbstractFactory factory = new ChicagoPizzaFactory();

        if ("dough".equals(type)) {
            pizza = new DoughPizza(factory);
            pizza.setName("ChicagoDoughPizza");
        }
        if ("sauce".equals(type)) {
            pizza = new SaucePizza(factory);
            pizza.setName("ChicagoSaucePizza");
        }
        if ("cheese".equals(type)) {
            pizza = new CheesePizza(factory);
            pizza.setName("ChicagoCheesePizza");
        }
        return pizza;
    }
}
