package com.pluralsight.Loaf_Toppings;

import com.pluralsight.Loaf_Emuns.SandwichSize;

public class Loaf_RegularToppings extends Loaf_Toppings {
    public Loaf_RegularToppings(String name, boolean isExtra) {
        super(name, isExtra);
    }

    @Override
    public double getPrice(SandwichSize size) {
        return 0.0;
    }
}
