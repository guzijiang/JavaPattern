package com.pattern6.Pizza.two;

public class ChicagoStyleCheesePizza extends PizzaAB {
    public ChicagoStyleCheesePizza() {
        name = "Chicago Style Cheese Pizza";
        dough = "Chicago Style dough";
        sauce = "Chicago Style sauce";

        toppings.add("Chicago Style topping");
    }

    @Override
    protected void cut() {
        System.out.println("Chicago Style cut pizza ...");
    }
}
