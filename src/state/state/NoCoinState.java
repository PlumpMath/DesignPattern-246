package state.state;

import state.CandyMachine;

/**
 * Created by Rick on 2017/3/10.
 */
public class NoCoinState implements IState {

    CandyMachine machine;

    public NoCoinState(CandyMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("u insert a coin");
        machine.setState(machine.getHasCoinState());
    }

    @Override
    public void withdrawCoin() {
        System.out.println("u din't insert a coin");
    }

    @Override
    public void tryGetCandy() {
        System.out.println("u didn't insert a coin,you cant not try to get a candy");
    }

    @Override
    public void dispense() {
        System.out.println("u need pay first");
    }
}
