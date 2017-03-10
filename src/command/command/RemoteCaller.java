package command.command;

/**
 * Created by Rick on 2017/3/10.
 */
public class RemoteCaller {
    ICommand commander;

    public RemoteCaller(ICommand command) {
        this.commander = command;
    }

    public void onUndoKeyUp() {
        commander.undo();
    }

    public void onDoKeyUp() {
        commander.execute();
    }
}
