package state.state;

import state.CandyMachine;

/**
 * Created by Rick on 2017/3/10.
 */
public class SoldState implements IState {

    CandyMachine machine;

    public SoldState(CandyMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("no!");
    }

    @Override
    public void withdrawCoin() {
        System.out.println("no!");
    }

    @Override
    public void tryGetCandy() {
        System.out.println("no");
    }

    @Override
    public void dispense() {
        machine.releaseACandy();

        if (machine.getCount() > 0) {
            System.out.println("now get your candy");
            machine.setState(machine.getNoCoinState());
        } else {
            System.out.println("Oops! out of candy");
            machine.setState(machine.getSoldOutState());
        }

    }
}
