package state;

/**
 * Created by Rick on 2017/3/10.
 */
public class StateDpTest {

    public static void main(String[] args) {
        CandyMachine machine = new CandyMachine(10);

        machine.insert();
        machine.withdraw();
        machine.insert();
        machine.turnCrank();
        machine.withdraw();
    }
}
