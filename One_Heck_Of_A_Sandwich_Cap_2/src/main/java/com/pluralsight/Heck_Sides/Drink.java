package com.pluralsight.Heck_Sides;

import com.pluralsight.Sandwich_Emuns.Heck_Drink_Sizes;

public class Drink {
    private Heck_Drink_Sizes size;
    private String flavor;

    public Drink(Heck_Drink_Sizes size, String flavor) {
        this.size = size;
        this.flavor = flavor;
    }

    public Heck_Drink_Sizes getSize() {
        return size;
    }

    public void setSize(Heck_Drink_Sizes size) {
        this.size = size;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getPrice() {
        return size.getPrice();
    }

    public String getDetails() {
        return size.name() + " Drink - " + flavor + " ($" + String.format("%.2f", getPrice()) + ")";
    }
}