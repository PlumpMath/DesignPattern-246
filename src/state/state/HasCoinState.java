package state.state;

import state.CandyMachine;

/**
 * Created by Rick on 2017/3/10.
 */
public class HasCoinState implements IState {

    CandyMachine machine;

    public HasCoinState(CandyMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("u cannot insert another coin");
    }

    @Override
    public void withdrawCoin() {
        System.out.println("u withdrawn a coin");
        machine.setState(machine.getNoCoinState());
    }

    @Override
    public void tryGetCandy() {
        System.out.println("your turned...");
        machine.setState(machine.getSoldState());
    }

    @Override
    public void dispense() {
        System.out.println("No candy to dispense");
    }
}
