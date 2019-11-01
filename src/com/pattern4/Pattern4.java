package com.pattern4;

import com.pattern4.turkey.facade.CeilingFan;
import com.pattern4.turkey.facade.HomeTheaterFacade;
import com.pattern4.turkey.facade.Light;
import com.pattern4.turkey.facade.Stereo;

public class Pattern4 {
    // 适配器模式 将一个类的接口 转换成客户期望的另一个接口

    // 对象和类适配器
    // 对象适配器 利用组合的方式 将请求传送给被适配者
    // 类适配器 继承了Target和Adaptee

    // 装饰者 不改变接口，但加入责任
    // 适配器 将一个接口转换成另一个接口
    // 外观模式 让接口更简单
    // 最少知识原则: 只和你的密友谈话
    public static void main(String[] args) {
//        WildTurkey turkey = new WildTurkey();
//        Duck turkeyAdapter = new TurkeyAdapter(turkey);
//
//        turkeyAdapter.quack();
//        turkeyAdapter.fly();

        CeilingFan ceilingFan = new CeilingFan("Living room");
        Light light = new Light();
        Stereo stereo = new Stereo();

        HomeTheaterFacade facade = new HomeTheaterFacade(ceilingFan, light, stereo);
        facade.watchMovie("AAA");
        facade.endMovie();
    }
}
