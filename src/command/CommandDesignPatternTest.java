package command;

import command.command.ICommand;
import command.command.LightOnCommand;
import command.command.RemoteCaller;
import command.model.Light;

/**
 * Created by Rick on 2017/3/10.
 */
public class CommandDesignPatternTest {

    public static void main(String[] args) {
        Light light = new Light("Kitchen");
        ICommand com = new LightOnCommand(light);
        RemoteCaller caller = new RemoteCaller(com);

        caller.onDoKeyUp();
        caller.onUndoKeyUp();
    }
}
