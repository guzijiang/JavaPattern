package com.pattern8;

import com.pattern8.command.*;
import com.pattern8.command.impl.*;

public class Pattern8 {

    // 命令模式 把方法调用(method invocation)封装起来
    // 命令模式 把"请求"封装成对象，以便使用不同的请求，队列或者日志来参数化其它对象
    // 命令模式的更多用途: 队列请求(日程安排，线程池，工作队列)，日志请求(系统死机，将命令对象重新加载，依次调用对象的execute)
    public static void main(String[] args) {
//        SimpleRemoteControl remote = new SimpleRemoteControl();
//        LightOnCommand lightOn = new LightOnCommand(new Light());
//
//        remote.setCommand(lightOn);
//        remote.buttonWasPressed();



//        RemoteControl remoteControl = new RemoteControl();
//
//        Light light = new Light();
//        Stereo stereo = new Stereo();
//
//        LightOnCommand lightOnCommand = new LightOnCommand(light);
//        LightOffCommand lightOffCommand = new LightOffCommand(light);
//
//        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
//        StereoOffWithCDCommand stereoOffWithCDCommand = new StereoOffWithCDCommand(stereo);
//
//        remoteControl.setCommand(0, lightOnCommand, lightOffCommand);
//        remoteControl.setCommand(1, stereoOnWithCDCommand, stereoOffWithCDCommand);
//
//        remoteControl.onButtonWasPushed(0);
//        remoteControl.offButtonWasPushed(0);
//        remoteControl.undoButtonWasPushed();
//
//        remoteControl.onButtonWasPushed(1);
//        remoteControl.offButtonWasPushed(1);



//        RemoteControl remoteControl = new RemoteControl();
//
//        CeilingFan ceilingFan = new CeilingFan("Living Room");
//        CeilingFanLowCommand fanLowCommand = new CeilingFanLowCommand(ceilingFan);
//        CeilingFanHighCommand fanHighCommand = new CeilingFanHighCommand(ceilingFan);
//        CeilingFanOffCommand fanOffCommand = new CeilingFanOffCommand(ceilingFan);
//
//        remoteControl.setCommand(0, fanLowCommand, fanOffCommand);
//        remoteControl.setCommand(1, fanHighCommand, fanOffCommand);
//
//        remoteControl.onButtonWasPushed(0);
//        remoteControl.offButtonWasPushed(0);
//        remoteControl.undoButtonWasPushed();
//
//        remoteControl.onButtonWasPushed(1);
//        remoteControl.undoButtonWasPushed();



        RemoteControl remoteControl = new RemoteControl();
        Light light = new Light();
        Stereo stereo = new Stereo();

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
        StereoOffWithCDCommand stereoOffWithCDCommand = new StereoOffWithCDCommand(stereo);

        Command[] partyOn = {lightOnCommand, stereoOnWithCDCommand};
        Command[] partyOff = {lightOffCommand, stereoOffWithCDCommand};

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        remoteControl.setCommand(0, partyOnMacro, partyOffMacro);
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
    }
}
