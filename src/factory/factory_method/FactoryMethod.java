package factory.factory_method;

/**
 * Created by Rick on 2017/3/9.
 */
public abstract class FactoryMethod {

    public void display() {
        Number number = factoryMethod();
        System.out.println("number is : " + number.toString());
        if (number instanceof Integer && number != null && number.intValue() != 0) {
            System.out.println("the divided result is :" + 1 / number.intValue());
        }
        if (number instanceof Float && number != null && Math.abs(number.floatValue() - 0.0) < 0.1) {
            System.out.println("the divided result is :" + 1 / number.floatValue());
        }
    }

    abstract Number factoryMethod();
}
