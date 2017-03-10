package command.model;

/**
 * Created by Rick on 2017/3/10.
 */
public class Light {

    String name;

    public Light(String name) {
        this.name = name;
    }

    public void off() {
        System.out.println("light [" + name + "] off");
    }

    public void on() {
        System.out.println("light [" + name + "] on");
    }
}
