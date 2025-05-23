package com.pluralsight.Sandwich_Emuns;

public enum Heck_Sandwich_Sizes {
    FOUR_INCH(5.50),
    EIGHT_INCH(7.00),
    TWELVE_INCH(8.50);

    private final double basePrice;

    Heck_Sandwich_Sizes(double basePrice){
        this.basePrice = basePrice;
    }

    public double getBasePrice(){
        return basePrice;
    }
}
