package com.pattern4.turkey.impl;

import com.pattern4.turkey.Turkey;

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
