package com.pattern7.chocolate;

public class ChocolateBoiler {
    private ChocolateBoiler() {}

//    private static ChocolateBoiler uniqueInstance;

//    public static ChocolateBoiler getInstance() {
//        if (uniqueInstance == null) {
//            uniqueInstance = new ChocolateBoiler();
//        }
//        return uniqueInstance;
//    }

//    public static synchronized ChocolateBoiler getInstance() {
//        if (uniqueInstance == null) {
//            uniqueInstance = new ChocolateBoiler();
//        }
//        return uniqueInstance;
//    }

//    private static ChocolateBoiler uniqueInstance = new ChocolateBoiler();
//    public static ChocolateBoiler getInstance() {
//        return uniqueInstance;
//    }

    private volatile static ChocolateBoiler uniqueInstance;

    public static ChocolateBoiler getInstance() {
        if (uniqueInstance == null) {
            synchronized (ChocolateBoiler.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new ChocolateBoiler();
                }
            }
        }
        return uniqueInstance;
    }
}
