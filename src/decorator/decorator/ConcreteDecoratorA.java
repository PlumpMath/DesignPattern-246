package decorator.decorator;

import decorator.Component;

/**
 * Created by Rick on 2017/3/9.
 */
public class ConcreteDecoratorA extends Decorator {

    public ConcreteDecoratorA(Component wrappedObj) {
        super(wrappedObj);
    }

    @Override
    public void read() {
        System.out.println("pre reading...");
        super.read();
        System.out.println("over reading...");

    }
}
