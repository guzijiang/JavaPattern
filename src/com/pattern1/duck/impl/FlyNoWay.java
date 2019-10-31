package com.pattern1.duck.impl;

import com.pattern1.duck.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("FlyNoWay ------ ");
    }
}
