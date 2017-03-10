package factory.abstract_factory.store;

import factory.abstract_factory.factory.AbstractFactory;
import factory.abstract_factory.factory.NYPizzaFactory;
import factory.abstract_factory.pizza.CheesePizza;
import factory.abstract_factory.pizza.DoughPizza;
import factory.abstract_factory.pizza.Pizza;
import factory.abstract_factory.pizza.SaucePizza;

/**
 * Created by Rick on 2017/3/10.
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;

        // store以前依赖于各种具体的Pizza类，现在依赖于抽象工厂；（和抽象Pizza类）
        AbstractFactory factory = new NYPizzaFactory();

        if ("dough".equals(type)) {
            pizza = new DoughPizza(factory);
            pizza.setName("NYDoughPizza");
        }
        if ("sauce".equals(type)) {
            pizza = new SaucePizza(factory);
            pizza.setName("NYSaucePizza");
        }
        if ("cheese".equals(type)) {
            pizza = new CheesePizza(factory);
            pizza.setName("NYCheesePizza");
        }
        return pizza;
    }
}
