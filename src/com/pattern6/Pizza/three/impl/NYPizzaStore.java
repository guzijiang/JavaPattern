package com.pattern6.Pizza.three.impl;

import com.pattern6.Pizza.three.PizzaAB;
import com.pattern6.Pizza.three.PizzaIngredientFactory;
import com.pattern6.Pizza.three.PizzaStoreAB;

public class NYPizzaStore extends PizzaStoreAB {
    @Override
    public PizzaAB createPizza(String type) {
        PizzaAB pizzaAB = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if ("cheese".equals(type)) {
            pizzaAB = new CheesePizza(ingredientFactory);
            pizzaAB.setName("New York Style Cheese Pizza");
            return pizzaAB;
        } else {
            return null;
        }
    }
}
