package com.pattern9;

import com.pattern9.caffeine.CoffeeWithHook;

public class Pattern9 {

    // 好莱坞原则 别调用我们 我们会调用你

    // 模板方法模式
    // 排序模板
    public static void main(String[] args) {
        CoffeeWithHook coffeeWithHook = new CoffeeWithHook();
        System.out.println("Making coffee ....");
        coffeeWithHook.prepareRecipe();
    }
}
