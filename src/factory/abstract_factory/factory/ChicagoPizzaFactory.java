package factory.abstract_factory.factory;

import factory.abstract_factory.raw.*;

/**
 * Created by Rick on 2017/3/10.
 */
public class ChicagoPizzaFactory implements AbstractFactory {
    @Override
    public Cheese createCheese() {
        return null;
    }

    @Override
    public Clams createClams() {
        return null;
    }

    @Override
    public Dough createDough() {
        return null;
    }

    @Override
    public Pepperoni createPepperoni() {
        return null;
    }

    @Override
    public Sauce createSauce() {
        return null;
    }

    @Override
    public Veggie[] createVeggie() {
        return new Veggie[0];
    }
}
