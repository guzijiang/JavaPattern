package com.pattern9.caffeine;

public abstract class CaffeineBeverageWithHook {
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    void boilWater() {
        System.out.println("CaffeineBeverage --- boilWater");
    }

    abstract void brew();

    void pourInCup() {
        System.out.println("CaffeineBeverage --- pourInCup");
    }

    abstract void addCondiments();

    boolean customerWantsCondiments() {
        return true;
    }
}
