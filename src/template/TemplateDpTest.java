package template;

/**
 * Created by Rick on 2017/3/10.
 */
public class TemplateDpTest {

    public static void main(String[] args) {
        IDrinkMakerBehavior drinkMakerBehavior = new CoffeeMaker();
        drinkMakerBehavior.make();
        drinkMakerBehavior = new TeaMaker();
        drinkMakerBehavior.make();

    }
}
