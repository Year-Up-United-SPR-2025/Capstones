package com.pluralsight.Loaf_Sig;


import com.pluralsight.Loaf_Emuns.BreadType;
import com.pluralsight.Loaf_Emuns.SandwichSize;
import com.pluralsight.Loaf_Package.Loaf;

public class Signature extends Loaf {
    private final String name;

    public Signature(String name, SandwichSize size, BreadType breadType, boolean toasted) {
        super(size, breadType, toasted);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " Signature Sandwich (" + getSize() + ", " + getBreadType() + ", " + (isToasted() ? "Toasted" : "Not Toasted") + ")";
    }
}
