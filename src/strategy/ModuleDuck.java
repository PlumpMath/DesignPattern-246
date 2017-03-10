package strategy;

import strategy.changable_algorithm.FlyNoWay;

/**
 * Created by Rick on 2017/3/9.
 */
public class ModuleDuck extends Duck {

    public ModuleDuck() {
        this.flyable = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("module duck");
    }
}
