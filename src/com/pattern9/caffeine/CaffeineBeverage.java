package com.pattern9.caffeine;

public abstract class CaffeineBeverage {

    // 模板方法 它用作一个算法的模板，用来制作咖啡因饮料
    // 某些方法是由这个类(超类)处理 某些方式由子类处理
    // 需要由子类提供的方法，必须在超类中申明为抽象
    public final void prepareRecipe() {
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
