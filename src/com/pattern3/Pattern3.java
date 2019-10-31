package com.pattern3;

import com.pattern3.beverage.Beverage;
import com.pattern3.beverage.impl.Espresso;
import com.pattern3.beverage.impl.HouseBlend;
import com.pattern3.beverage.impl.Mocha;
import com.pattern3.beverage.impl.Whip;

public class Pattern3 {

    // 类应该对扩展开放，对修改关闭

    // 装饰者模式 动态地将责任附加到对象上
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + "$" + beverage.cost());

        Beverage beverage1 = new HouseBlend();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription() + "$" + beverage1.cost());
    }
}
