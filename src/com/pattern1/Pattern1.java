package com.pattern1;

import com.pattern1.duck.Duck;
import com.pattern1.duck.impl.FlyRocketPowered;
import com.pattern1.duck.impl.MallardDuck;
import com.pattern1.duck.impl.ModelDuck;

public class Pattern1 {

    // 封装变化(分离变化的和不变的逻辑 将变化的逻辑抽离出来)
    // 针对接口编程
    // 多用组合 少用继承

    // 抽象 封装 继承 多态

    // 策略模式 定义了算法族 分别封装起来 可以相互之间替换
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}


