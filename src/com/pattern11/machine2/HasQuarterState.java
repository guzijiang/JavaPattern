package com.pattern11.machine2;

public class HasQuarterState implements State {
    GumballMachine machine;

    public HasQuarterState(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {

    }

    @Override
    public void ejectQuarter() {
        System.out.println("ejectQuarter done --- ");
        machine.setState(machine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("turnCrank done --- ");
//        machine.setState(machine.getSoldState());
        machine.setState(machine.getWinnerState());
        machine.dispense();
    }

    @Override
    public void dispense() {

    }
}
