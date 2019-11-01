package com.pattern10.menu2;

import java.util.Iterator;

public abstract class MenuComponent {
    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }


    public String getName() {
        throw new UnsupportedOperationException();
    }

    public float getPrice() {
        throw new UnsupportedOperationException();
    }

    public boolean isVegetarian() {
        throw new UnsupportedOperationException();
    }


    public abstract void print();

    public abstract Iterator createIterator();
}
