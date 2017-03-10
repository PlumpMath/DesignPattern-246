package strategy;

import strategy.changable_algorithm.FlyWithWings;

/**
 * Created by Rick on 2017/3/9.
 */
public class MallardDuck extends Duck {
    public MallardDuck() {
        this.flyable = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I am Mallard duck");
    }
}
