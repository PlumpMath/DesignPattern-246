package decorator.decorator;

import decorator.Component;

/**
 * Created by Rick on 2017/3/9.
 */
public class Decorator extends Component {

    Component wrappedObj;

    public Decorator(Component wrappedObj) {
        this.wrappedObj = wrappedObj;
    }

    @Override
    public void read() {
        wrappedObj.read();
    }
}
