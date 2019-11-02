package com.pattern11.machine2;

public class WinnerState implements State {
    GumballMachine machine;

    public WinnerState(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {

    }

    @Override
    public void ejectQuarter() {

    }

    @Override
    public void turnCrank() {

    }

    @Override
    public void dispense() {
        System.out.println("---------dispense twice---------");
        machine.releaseBall();
        if (machine.getCount() < 1) {
            System.out.println("sold out --- ");
            machine.setState(machine.getSoldOutState());
        } else {
            machine.releaseBall();
            if (machine.getCount() < 1) {
                System.out.println("sold out --- ");
                machine.setState(machine.getSoldOutState());
            } else {
                machine.setState(machine.getNoQuarterState());
            }
        }

    }
}
