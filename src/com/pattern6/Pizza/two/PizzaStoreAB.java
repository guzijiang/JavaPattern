package com.pattern6.Pizza.two;

public abstract class PizzaStoreAB {
    public void orderPizza(String type) {
        PizzaAB pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

    }

    public abstract PizzaAB createPizza(String type);
}
