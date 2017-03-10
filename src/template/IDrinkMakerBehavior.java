package template;

/**
 * Created by Rick on 2017/3/10.
 */
public abstract class IDrinkMakerBehavior {

    public void make() {
        boilWater();
        brew();
        pourInCup();
        addCondiment();
    }

    void boilWater() {
        System.out.println("boil water");
    }

    abstract void brew();

    void pourInCup() {
        System.out.println("pour in cup");
    }

    abstract void addCondiment();

}
