package com.pattern11.machine;

public class GumballMachine {
    final static int SOLD_OUT = 0;
    final static int NO_QUARTER = 1;
    final static int HAS_QUARTER = 2;
    final static int SOLD = 3;

    int state = SOLD_OUT;
    int count = 0;

    public GumballMachine(int count) {
        this.count = count;
        if (count > 0) {
            state = NO_QUARTER;
        }
    }

    /**
     * 投入硬币
     */
    public void insertQuarter() {
        System.out.println("---------insertQuarter---------");
        if (state == HAS_QUARTER) {
            System.out.println("HAS QUARTER ---");
        } else if (state == NO_QUARTER) {
            state = HAS_QUARTER;
            System.out.println("insertQuarter done ---");
        } else if (state == SOLD) {
            System.out.println("Please wait ---");
        } else if (state == SOLD_OUT) {
            System.out.println("SOLD OUT ---");
        }
    }

    /**
     * 退回硬币
     */
    public void ejectQuarter() {
        System.out.println("---------ejectQuarter---------");
        if (state == HAS_QUARTER) {
            state = NO_QUARTER;
            System.out.println("ejectQuarter done ---");
        } else if (state == NO_QUARTER) {
            System.out.println("NO QUARTER ---");
        } else if (state == SOLD) {
            System.out.println("Please wait ---");
        } else if (state == SOLD_OUT) {
            System.out.println("NO QUARTER & SOLD OUT ---");
        }
    }

    /**
     * 转动曲柄
     */
    public void turnCrank() {
        System.out.println("----------turnCrank--------");
        if (state == NO_QUARTER) {
            System.out.println("NO QUARTER ---");
        } else if (state == HAS_QUARTER) {
            state = SOLD;
            System.out.println("turnCrank done---");
            dispense();
        } else if (state == SOLD) {
            System.out.println("Please wait ---");
        } else if (state == SOLD_OUT) {
            System.out.println("SOLD OUT ---");
        }
    }

    /**
     * 发放糖果
     */
    public void dispense() {
        System.out.println("---------dispense---------");
        if (state == NO_QUARTER) {
            System.out.println("NO QUARTER ---");
        } else if (state == HAS_QUARTER) {
            System.out.println("HAS QUARTER ---");
        } else if (state == SOLD) {
            System.out.println("dispense done ---");
            count -= 1;
            if (count == 0) {
                System.out.println("SOLD OUT ---");
                state = SOLD_OUT;
            } else {
                state = NO_QUARTER;
            }
        } else if (state == SOLD_OUT) {
            System.out.println("SOLD OUT ---");
        }
    }
}
