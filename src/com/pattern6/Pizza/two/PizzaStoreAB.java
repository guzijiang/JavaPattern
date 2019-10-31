package com.pattern6.Pizza.two;

public abstract class PizzaStoreAB {
    public PizzaAB orderPizza(String type) {
        PizzaAB pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    public abstract PizzaAB createPizza(String type);
}
