package com.pluralsight.Sandwich_Emuns;

public enum Heck_Sandwich_Sizes {
    FOUR_INCH(5.50, 1.00, 0.50, 0.75, 0.30),
    EIGHT_INCH(7.00, 2.00, 1.00, 1.50, 0.60),
    TWELVE_INCH(8.50, 3.00, 1.50, 2.25, 0.90);

    private final double basePrice;
    private final double meatPrice;
    private final double extraMeatPrice;
    private final double cheesePrice;
    private final double extraCheesePrice;

    Heck_Sandwich_Sizes(double basePrice, double meatPrice, double extraMeatPrice, double cheesePrice, double extraCheesePrice) {
        this.basePrice = basePrice;
        this.meatPrice = meatPrice;
        this.extraMeatPrice = extraMeatPrice;
        this.cheesePrice = cheesePrice;
        this.extraCheesePrice = extraCheesePrice;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public double getMeatPrice() {
        return meatPrice;
    }

    public double getExtraMeatPrice() {
        return extraMeatPrice;
    }

    public double getCheesePrice() {
        return cheesePrice;
    }

    public double getExtraCheesePrice() {
        return extraCheesePrice;
    }
}
