package com.pluralsight.Heck_Toppings;

import com.pluralsight.Heck_Emuns.SandwichSize;

public abstract class Heckful_Toppings {
    protected String name;
    protected boolean isExtra;

    public Heckful_Toppings(String name, boolean isExtra) {
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
