package com.pattern8.command.impl;

import com.pattern8.command.Command;
import com.pattern8.command.Stereo;

public class StereoOnWithCDCommand implements Command {
    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume();
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
