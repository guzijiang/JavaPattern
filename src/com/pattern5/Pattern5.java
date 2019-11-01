package com.pattern5;

import com.pattern5.facade.CeilingFan;
import com.pattern5.facade.HomeTheaterFacade;
import com.pattern5.facade.Light;
import com.pattern5.facade.Stereo;

public class Pattern5 {

    // 最少知识原则 只和你的密友谈话

    // 外观模式 让接口更简单
    public static void main(String[] args) {
        CeilingFan ceilingFan = new CeilingFan("Living room");
        Light light = new Light();
        Stereo stereo = new Stereo();

        HomeTheaterFacade facade = new HomeTheaterFacade(ceilingFan, light, stereo);
        facade.watchMovie("AAA");
        facade.endMovie();
    }
}
