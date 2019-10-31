package com.pattern6;

import com.pattern6.Pizza.two.ChicagoStylePizzaStore;
import com.pattern6.Pizza.two.NYStylePizzaStore;
import com.pattern6.Pizza.two.PizzaStoreAB;

public class Pattern6 {

    // 简单工厂其实不是一个设计模式，反而比较像是一种编程习惯
    // 工厂方法模式 定义了一个创建对象的接口，但由子类决定要实例化的类是哪一个
    // 抽象工厂模式 提供一个接口，用于创建相关或依赖对象的家族，而不需要明确指定具体类

    // 要依赖抽象，不要依赖具体类
    public static void main(String[] args) {
        PizzaStoreAB nyStore = new NYStylePizzaStore();
        PizzaStoreAB chicagoStore = new ChicagoStylePizzaStore();

        nyStore.orderPizza("cheese");
        chicagoStore.orderPizza("cheese");

    }
}
