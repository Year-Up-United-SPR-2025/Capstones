package com.pluralsight.Loaf_Emuns;

public enum DrinkTypes {
    COKE, SPRITE, LEMONDADE, WATER;

    @Override
    public String toString() {
        return switch (this) {
            case COKE -> "Coke";
            case SPRITE -> "Sprite";
            case LEMONDADE -> "Lemonade";
            case WATER -> "Water";
        };
    }

}