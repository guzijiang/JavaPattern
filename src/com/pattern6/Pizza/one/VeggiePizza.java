package com.pattern6.Pizza.one;

import com.pattern6.Pizza.one.Pizza;

public class VeggiePizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("VeggiePizza --- prepare");
    }

    @Override
    public void bake() {
        System.out.println("VeggiePizza --- bake");
    }

    @Override
    public void cut() {
        System.out.println("VeggiePizza --- cut");
    }

    @Override
    public void box() {
        System.out.println("VeggiePizza --- box");
    }
}
