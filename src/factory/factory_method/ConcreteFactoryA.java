package factory.factory_method;

/**
 * Created by Rick on 2017/3/9.
 */
public class ConcreteFactoryA extends FactoryMethod {
    @Override
    Number factoryMethod() {
        return new Integer(1);
    }
}
