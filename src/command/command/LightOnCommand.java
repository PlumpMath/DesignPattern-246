package command.command;

import command.model.Light;

/**
 * Created by Rick on 2017/3/10.
 */
public class LightOnCommand implements ICommand {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
