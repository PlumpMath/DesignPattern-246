package factory.abstract_factory.pizza;

import factory.abstract_factory.factory.AbstractFactory;

/**
 * Created by Rick on 2017/3/10.
 */
public class SaucePizza extends Pizza {
    private final AbstractFactory factory;

    public SaucePizza(AbstractFactory factory) {
        this.factory = factory;
    }

    @Override
    public void prepare() {

        System.out.println("prepare " + name);
        dough = factory.createDough();
        cheese = factory.createCheese();
        sauce = factory.createSauce();
    }
}
