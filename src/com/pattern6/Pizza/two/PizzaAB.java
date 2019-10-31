package com.pattern6.Pizza.two;

import java.util.ArrayList;

public abstract class PizzaAB {
    protected String name;
    protected String dough;
    protected String sauce;

    protected ArrayList<String> toppings = new ArrayList();

    protected void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding topping ...");
        for (String o : toppings) {
            System.out.println("    " + o);
        }
    }

    protected void bake() {
        System.out.println("bake pizza 25 minute ...");
    }

    protected void cut() {
        System.out.println("cut pizza ...");
    }

    protected void box() {
        System.out.println("box pizza ...");
    }

    public String getName() {
        return name;
    }
}
