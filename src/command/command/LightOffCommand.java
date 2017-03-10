package command.command;

import command.model.Light;

/**
 * Created by Rick on 2017/3/10.
 */
public class LightOffCommand implements ICommand {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
