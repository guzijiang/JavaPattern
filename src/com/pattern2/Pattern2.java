package com.pattern2;

import com.pattern2.weather.impl.CurrentConditionsDisplay;
import com.pattern2.weather.impl.WeatherData;

public class Pattern2 {

    // 为了交互对象之间的松耦合设计而努力

    // 观察者模式 当一个对象改变状态 依赖它的对象都会收到通知 并自动更新
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.4f);
        weatherData.setMeasurements(78, 90, 28.4f);
    }
}
