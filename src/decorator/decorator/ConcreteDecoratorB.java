package decorator.decorator;

import decorator.Component;

/**
 * Created by Rick on 2017/3/9.
 */
public class ConcreteDecoratorB extends Decorator {

    public ConcreteDecoratorB(Component wrappedObj) {
        super(wrappedObj);
    }

    @Override
    public void read() {
        System.out.println("loading...");
        super.read();
        System.out.println("closing...");

    }
}
