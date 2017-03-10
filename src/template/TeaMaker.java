package template;

/**
 * Created by Rick on 2017/3/10.
 */
public class TeaMaker extends IDrinkMakerBehavior {
    @Override
    void brew() {
        System.out.println(
                "soak brew"
        );
    }

    @Override
    void addCondiment() {
        System.out.println("add tea leaves");
    }
}
