package com.pattern10.menu2;

import java.util.Iterator;

public class MenuItem extends MenuComponent {
    String name;
    float price;
    boolean vegetarian;

    public MenuItem(String name, float price, boolean vegetarian) {
        this.name = name;
        this.price = price;
        this.vegetarian = vegetarian;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public float getPrice() {
        return price;
    }

    @Override
    public boolean isVegetarian() {
        return vegetarian;
    }

    @Override
    public void print() {
        if (isVegetarian()) {
            System.out.println(getName()  + "(v)  " + ",  " +  getPrice());
        } else {
            System.out.println(getName() + ",  " +  getPrice());
        }
    }

    @Override
    public Iterator createIterator() {
        return new NullIterator();
    }
}
