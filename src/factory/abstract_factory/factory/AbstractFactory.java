package factory.abstract_factory.factory;

import factory.abstract_factory.raw.*;

/**
 * Created by Rick on 2017/3/10.
 */
public interface AbstractFactory {


    Cheese createCheese();

    Clams createClams();

    Dough createDough();

    Pepperoni createPepperoni();

    Sauce createSauce();

    Veggie[] createVeggie();
}
