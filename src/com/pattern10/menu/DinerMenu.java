package com.pattern10.menu;

public class DinerMenu {
    static final int MAX_ITEMS= 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("testA", 5.99f);
        addItem("testB", 4.55f);
        addItem("testC", 3.99f);
    }

    public void addItem(String name, float price) {
        if (numberOfItems >= MAX_ITEMS) {
            System.out.println("Sorry, Menu is full!");
            return;
        }
        MenuItem menuItem = new MenuItem(name, price);
        menuItems[numberOfItems] = menuItem;
        numberOfItems++;
    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }

    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
