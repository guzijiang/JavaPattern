package com.pattern6.Pizza.three;

public abstract class PizzaAB {
    protected String name;
    protected Dough dough;
    protected Sauce sauce;

    protected abstract void prepare();

    protected void bake() {
        System.out.println("bake pizza 25 minute ...");
    }

    protected void cut() {
        System.out.println("cut pizza ...");
    }

    protected void box() {
        System.out.println("box pizza ...");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
