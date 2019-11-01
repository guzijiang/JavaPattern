package com.pattern11;

import com.pattern11.machine.GumballMachine;

public class Pattern11 {

    // 策略模式和状态模式是双胞胎，在出生时才分开

    // 状态模式 允许对象在内部状态改变时改变它的行为，对象看起来好像修改了它的类
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(2);

        System.out.println("---------test111111111---------");

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println("---------test2222222222---------");

        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();
        gumballMachine.turnCrank();

        System.out.println("---------test333333333---------");

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.ejectQuarter();
    }
}
