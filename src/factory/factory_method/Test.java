package factory.factory_method;

/**
 * Created by Rick on 2017/3/9.
 */
public class Test {

    public static void main(String[] args) {
        FactoryMethod factory = new ConcreteFactoryA();

        factory.display();
        factory = new ConcreteFactoryB();
        factory.display();
    }
}
