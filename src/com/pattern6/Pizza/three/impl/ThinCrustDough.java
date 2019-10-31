package com.pattern6.Pizza.three.impl;

import com.pattern6.Pizza.three.Dough;

public class ThinCrustDough implements Dough {
    @Override
    public void createDough() {
        System.out.println("ThinCrustDough --- ");
    }
}
