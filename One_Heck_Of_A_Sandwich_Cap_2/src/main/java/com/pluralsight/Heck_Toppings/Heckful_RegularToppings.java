package com.pluralsight.Heck_Toppings;

import com.pluralsight.Heck_Emuns.SandwichSize;

public class Heckful_RegularToppings extends Heckful_Toppings {
    public Heckful_RegularToppings(String name, boolean isExtra) {
        super(name, isExtra);
    }

    @Override
    public double getPrice(SandwichSize size) {
        return 0.0;
    }
}
