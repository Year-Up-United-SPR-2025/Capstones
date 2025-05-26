package com.pluralsight.Hecks_Signatures;

import com.pluralsight.Heck_Emuns.BreadType;
import com.pluralsight.Heck_Emuns.SandwichSize;
import com.pluralsight.One_Heck_of_a_Sandwich_Package.Heckful_Sandwich;

public class Hecks_Signature extends Heckful_Sandwich {
    private final String name;

    public Hecks_Signature(String name, SandwichSize size, BreadType breadType, boolean toasted) {
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
