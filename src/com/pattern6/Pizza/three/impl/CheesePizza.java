package com.pattern6.Pizza.three.impl;

import com.pattern6.Pizza.three.PizzaAB;
import com.pattern6.Pizza.three.PizzaIngredientFactory;

public class CheesePizza extends PizzaAB {
    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    protected void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
    }
}
