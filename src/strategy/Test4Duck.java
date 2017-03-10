package strategy;

import strategy.changable_algorithm.FlyWithWings;

/**
 * Created by Rick on 2017/3/9.
 */
public class Test4Duck {


    public static void main(String[] args) {
        Duck duck = new ModuleDuck();
        duck = new MallardDuck();
        duck.performFly();
        duck.setFlyable(new FlyWithWings());
        duck.performFly();
        duck.display();
    }
}
