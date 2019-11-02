package com.pattern11.machine2;

public class GumballMachine {
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State soldOutState;
    State winnerState;

    State state = null;
    int count = 0;

    public GumballMachine(int count) {
        this.count = count;

        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        soldOutState = new SoldOutState(this);
        winnerState = new WinnerState(this);
        if (count > 0) {
            state = noQuarterState;
        } else {
            state = soldOutState;
        }
    }

    /**
     * 投入硬币
     */
    public void insertQuarter() {
        System.out.println("---------insertQuarter---------");
        state.insertQuarter();
    }

    /**
     * 退回硬币
     */
    public void ejectQuarter() {
        System.out.println("---------ejectQuarter---------");
        state.ejectQuarter();
    }

    /**
     * 转动曲柄
     */
    public void turnCrank() {
        System.out.println("----------turnCrank--------");
        state.turnCrank();
    }

    /**
     * 发放糖果
     */
    public void dispense() {
        System.out.println("---------dispense---------");
        state.dispense();
    }

    public void releaseBall() {
        if (count > 0) {
            System.out.println("---------releaseBall---------");
            count -= 1;
        }
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public void setNoQuarterState(State noQuarterState) {
        this.noQuarterState = noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public void setHasQuarterState(State hasQuarterState) {
        this.hasQuarterState = hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public void setSoldState(State soldState) {
        this.soldState = soldState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public void setSoldOutState(State soldOutState) {
        this.soldOutState = soldOutState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public void setWinnerState(State winnerState) {
        this.winnerState = winnerState;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getCount() {
        return count;
    }
}
