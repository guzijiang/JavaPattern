package com.pattern1.duck.impl;

import com.pattern1.duck.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack ---------- ");
    }
}
