package com.pattern6.Pizza.two;

public class ChicagoStylePizzaStore extends PizzaStoreAB {
    @Override
    public PizzaAB createPizza(String type) {
        if ("cheese".equals(type)) {
            return new ChicagoStyleCheesePizza();
        } else {
            return null;
        }
    }
}
