package com.pluralsight.Sandwich_Emuns;

public enum ChipsType {
    CLASSIC(1.50),
    BBQ(1.50),
    SOUR_CREAM(1.50),
    JALAPENO(1.50),
    SALT_VINEGAR(1.50);

    private final double price;

    ChipsType(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
