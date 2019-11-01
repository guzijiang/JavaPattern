package com.pattern4;

import com.pattern4.turkey.impl.Duck;
import com.pattern4.turkey.impl.TurkeyAdapter;
import com.pattern4.turkey.impl.WildTurkey;

public class Pattern4 {
    // 适配器模式 将一个类的接口 转换成客户期望的另一个接口

    // 对象和类适配器
    // 对象适配器 利用组合的方式 将请求传送给被适配者
    // 类适配器 继承了Target和Adaptee

    // 装饰者 不改变接口，但加入责任
    // 适配器 将一个接口转换成另一个接口
    // 外观模式 让接口更简单
    public static void main(String[] args) {
        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        turkeyAdapter.quack();
        turkeyAdapter.fly();
    }
}
