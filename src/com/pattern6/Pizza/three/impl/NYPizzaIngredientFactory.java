package com.pattern6.Pizza.three.impl;

import com.pattern6.Pizza.three.Dough;
import com.pattern6.Pizza.three.PizzaIngredientFactory;
import com.pattern6.Pizza.three.Sauce;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }
}
