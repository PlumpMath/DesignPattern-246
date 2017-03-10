package decorator;

import decorator.component.ConcreteComponent;
import decorator.decorator.ConcreteDecoratorA;
import decorator.decorator.ConcreteDecoratorB;

/**
 * Created by Rick on 2017/3/9.
 */
public class Test4Decorator {

    public static void main(String[] args) {
        Component c = new ConcreteDecoratorA(new ConcreteDecoratorB(new ConcreteComponent()));
        c = new ConcreteDecoratorB(new ConcreteDecoratorA(new ConcreteComponent()));
        ConcreteComponent c1 = new ConcreteComponent();
        c1.setStr("hasjdfasldjfal");
        c = new ConcreteDecoratorB(c1);
        c.read();
    }
}
