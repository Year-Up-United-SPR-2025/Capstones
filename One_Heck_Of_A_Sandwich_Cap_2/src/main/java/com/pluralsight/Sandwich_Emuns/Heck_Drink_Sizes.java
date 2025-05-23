package com.pluralsight.Sandwich_Emuns;

public enum Heck_Drink_Sizes {
    SMALL(2.00),
    MEDIUM(2.50),
    LARGE(3.00);

    private final double price;

    Heck_Drink_Sizes(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}