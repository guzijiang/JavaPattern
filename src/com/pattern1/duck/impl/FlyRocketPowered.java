package com.pattern1.duck.impl;

import com.pattern1.duck.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("FlyRocketPowered ------");
    }
}
