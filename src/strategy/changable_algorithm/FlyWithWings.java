package strategy.changable_algorithm;

/**
 * Created by Rick on 2017/3/9.
 */
public class FlyWithWings implements IFlyBehavior{
    @Override
    public void fly() {
        System.out.println("fly with wings");
    }
}
