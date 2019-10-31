package com.pattern4.Turkey.impl;

import com.pattern4.Turkey.Turkey;

public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("fly short distance");
    }
}
