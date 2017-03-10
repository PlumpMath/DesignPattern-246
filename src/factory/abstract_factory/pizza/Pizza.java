package factory.abstract_factory.pizza;

import factory.abstract_factory.raw.*;

/**
 * Created by Rick on 2017/3/10.
 */
public abstract class Pizza {
    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Veggie veggie;
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clams clam;

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("cutting..");
    }

    public void box() {
        System.out.println("box...");
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough=" + dough +
                ", sauce=" + sauce +
                ", veggie=" + veggie +
                ", cheese=" + cheese +
                ", pepperoni=" + pepperoni +
                ", clam=" + clam +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }
}
