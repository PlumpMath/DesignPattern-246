package template;

/**
 * Created by Rick on 2017/3/10.
 */
public class CoffeeMaker extends IDrinkMakerBehavior {
    @Override
    void brew() {
        System.out.println(
                "brew coffee"
        );
    }

    @Override
    void addCondiment() {
        System.out.println("add coffee");
    }
}
