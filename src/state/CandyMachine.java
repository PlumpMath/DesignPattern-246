package state;

import state.state.*;

/**
 * Created by Rick on 2017/3/10.
 */
public class CandyMachine {
    private int count = 0;

    public void insert() {
        state.insertCoin();
    }

    public void turnCrank() {
        state.tryGetCandy();
        state.dispense();
    }

    public void withdraw() {
        state.withdrawCoin();
    }

    public IState getState() {
        return state;
    }

    public void setState(IState state) {
        this.state = state;
    }

    IState state = new SoldState(this);

    public IState getSoldState() {
        return soldState;
    }

    public void setSoldState(IState soldState) {
        this.soldState = soldState;
    }

    public IState getSoldOutState() {
        return soldOutState;
    }

    public void setSoldOutState(IState soldOutState) {
        this.soldOutState = soldOutState;
    }

    public IState getNoCoinState() {
        return noCoinState;
    }

    public void setNoCoinState(IState noCoinState) {
        this.noCoinState = noCoinState;
    }

    public IState getHasCoinState() {
        return hasCoinState;
    }

    public void setHasCoinState(IState hasCoinState) {
        this.hasCoinState = hasCoinState;
    }

    IState soldState, soldOutState, noCoinState, hasCoinState;

    public CandyMachine(int count) {
        this.soldState = new SoldState(this);
        this.soldOutState = new SoldOutState(this);
        this.noCoinState = new NoCoinState(this);
        this.hasCoinState = new HasCoinState(this);
        if (count > 0) {
            this.count = count;
            state = noCoinState;
        }
    }

    public void releaseACandy() {
        System.out.println("now a candy comes out");
        if (count > 0) count--;
    }

    public int getCount() {
        return count;

    }
}
