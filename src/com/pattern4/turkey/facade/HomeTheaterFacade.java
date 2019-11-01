package com.pattern4.turkey.facade;

public class HomeTheaterFacade {
    CeilingFan ceilingFan;
    Light light;
    Stereo stereo;

    public HomeTheaterFacade(CeilingFan ceilingFan, Light light, Stereo stereo) {
        this.ceilingFan = ceilingFan;
        this.light = light;
        this.stereo = stereo;
    }

    public void watchMovie(String movie) {
        System.out.println("watch a movie ..." + movie);
        ceilingFan.low();
        light.on();
        stereo.on();
        stereo.setCD();
        stereo.setVolume();
    }

    public void endMovie() {
        System.out.println("end a movie ...");
        ceilingFan.off();
        light.off();
        stereo.off();
    }
}
