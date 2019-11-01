package com.pattern10.menu;

import java.util.ArrayList;

public class PancakeHouseMenu {
    ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();

        addItem("test1", 1.99f);
        addItem("test2", 1.55f);
        addItem("test3", 0.99f);
    }

    public void addItem(String name, float price) {
       MenuItem menuItem = new MenuItem(name, price);
       menuItems.add(menuItem);
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public Iterator createIterator() {
        return new PancakeHouseMenuIterator(menuItems);
    }
}
