package com.pattern9.caffeine;

public abstract class CaffeineBeverage {
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    void boilWater() {
        System.out.println("CaffeineBeverage --- boilWater");
    }

    abstract void brew();

    void pourInCup() {
        System.out.println("CaffeineBeverage --- pourInCup");
    }

    abstract void addCondiments();
}
