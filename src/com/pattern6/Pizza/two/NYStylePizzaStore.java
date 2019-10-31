package com.pattern6.Pizza.two;

public class NYStylePizzaStore extends PizzaStoreAB {
    @Override
    public PizzaAB createPizza(String type) {
        if ("cheese".equals(type)) {
            return new NYStyleCheesePizza();
        } else {
            return null;
        }
    }
}
