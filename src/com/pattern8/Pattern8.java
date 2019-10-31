package com.pattern8;

import com.pattern8.command.Light;
import com.pattern8.command.SimpleRemoteControl;
import com.pattern8.command.impl.LightOnCommand;

public class Pattern8 {

    // 命令模式 把方法调用(method invocation)封装起来
    // 命令模式 把"请求"封装成对象，以便使用不同的请求，队列或者日志来参数化其它对象
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        LightOnCommand lightOn = new LightOnCommand(new Light());

        remote.setCommand(lightOn);
        remote.buttonWasPressed();
    }
}
