package com.pluralsight.Heck_Sandwich;

import com.pluralsight.Sandwich_Emuns.Heck_Sandwich_Sizes;
import com.pluralsight.Sandwich_Emuns.Heck_Toppings_Type;

public class Heck_Toppings {
    private final String name;
    private final Heck_Toppings_Type type;
    private final boolean isExtra;

    public Heck_Toppings(String name, Heck_Toppings_Type type, boolean isExtra) {
        this.name = name;
        this.type = type;
        this.isExtra = isExtra;
    }

    public String getName() {
        return name;
    }

    public Heck_Toppings_Type getType() {
        return type;
    }

    public boolean isExtra() {
        return isExtra;
    }

    public double getPrice(Heck_Sandwich_Sizes size) {
        return switch (type) {
            case MEAT -> isExtra ? size.getExtraMeatPrice() : size.getMeatPrice();
            case CHEESE -> isExtra ? size.getExtraCheesePrice() : size.getCheesePrice();
            default -> 0.0; // Regular toppings are free
        };
    }

    public String getDetails(Heck_Sandwich_Sizes size) {
        String extraText = isExtra ? " (extra)" : "";
        double price = getPrice(size);
        return name + extraText + (price > 0 ? " - $" + String.format("%.2f", price) : "");
    }
}
