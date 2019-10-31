package com.pattern8.command.impl;

import com.pattern8.command.Command;
import com.pattern8.command.Light;

public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
