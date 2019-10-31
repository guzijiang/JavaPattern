package com.pattern6.Pizza.three.impl;

import com.pattern6.Pizza.three.Dough;
import com.pattern6.Pizza.three.PizzaIngredientFactory;
import com.pattern6.Pizza.three.Sauce;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new GuziDough();
    }

    @Override
    public Sauce createSauce() {
        return new GuziSauce();
    }
}
