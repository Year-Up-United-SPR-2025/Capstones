package com.pluralsight.Loaf_Toppings;

import com.pluralsight.Loaf_Emuns.SandwichSize;

public abstract class Loaf_Toppings {
    protected String name;
    protected boolean isExtra;

    public Loaf_Toppings(String name, boolean isExtra) {
        this.name = name;
        this.isExtra = isExtra;
    }

    public String getName() {
        return name;
    }

    public boolean isExtra() {
        return isExtra;
    }

    public abstract double getPrice(SandwichSize size);
}
