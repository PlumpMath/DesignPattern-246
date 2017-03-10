package strategy;

import strategy.changable_algorithm.IFlyBehavior;

/**
 * Created by Rick on 2017/3/9.
 */
public abstract class Duck {

    protected IFlyBehavior flyable;

    public abstract void display();

    public void performFly() {
        flyable.fly();
    }

    public void setFlyable(IFlyBehavior flyable) {
        this.flyable = flyable;
    }
}
