package factory.factory_method;

/**
 * Created by Rick on 2017/3/9.
 */
public class ConcreteFactoryB extends FactoryMethod {
    @Override
    Number factoryMethod() {
        return new Float(1.01F);
    }
}
