package state.state;

import state.CandyMachine;

/**
 * Created by Rick on 2017/3/10.
 */
public class SoldOutState implements IState {

    CandyMachine machine;

    public SoldOutState(CandyMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("no candy,get your coin out");
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
