package decorator.component;

import decorator.Component;

/**
 * Created by Rick on 2017/3/9.
 */
public class ConcreteComponent extends Component {

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public void read() {
        System.out.println("string is :" + this.str);
    }
}
