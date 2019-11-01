package com.pattern10;

import com.pattern10.menu.DinerMenu;
import com.pattern10.menu.PancakeHouseMenu;
import com.pattern10.menu2.Menu;
import com.pattern10.menu2.MenuComponent;
import com.pattern10.menu2.MenuItem;
import com.pattern10.menu2.Waitress;

public class Pattern10 {
    // 设计原则 一个类应该只有一个引起变化的原因

    // 迭代器模式 提供一种方法顺序访问一个聚合对象中的各个元素，而又不暴露其内部的表示
    // 组合模式 允许你将对象组合成树形结构来表现"整体/部分"层次结构
    //         组合能让客户以一致的方式处理个别对象以及对象组合
    public static void main(String[] args) {
//        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
//        DinerMenu dinerMenu = new DinerMenu();
//
//        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
//        waitress.printMenu();

        MenuComponent breakfastMenu = new Menu("Breakfast");
        MenuComponent launchMenu = new Menu("Launch");
        MenuComponent dinnerMenu = new Menu("Dinner");

        MenuComponent allMenus = new Menu("All Menus");
        allMenus.add(breakfastMenu);
        allMenus.add(launchMenu);
        allMenus.add(dinnerMenu);

        breakfastMenu.add(new MenuItem("test1", 1.99f, true));
        breakfastMenu.add(new MenuItem("test2", 1.88f, false));
        breakfastMenu.add(new MenuItem("test3", 1.77f, false));

        launchMenu.add(new MenuItem("test4", 2.99f, false));
        launchMenu.add(new MenuItem("test5", 2.88f, true));
        launchMenu.add(new MenuItem("test6", 2.77f, false));

        dinnerMenu.add(new MenuItem("test7", 3.99f, false));
        dinnerMenu.add(new MenuItem("test8", 3.88f, false));
        dinnerMenu.add(new MenuItem("test9", 4.77f, true));

        Waitress waitress = new Waitress(allMenus);
//        waitress.printMenu();

        waitress.printVegetarianMenu();
    }
}
