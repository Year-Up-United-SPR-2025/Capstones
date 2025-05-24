package com.pluralsight.Heck_Toppings;

import com.pluralsight.Heck_Emuns.SandwichSize;

public class Heckful_PremiumToppings extends Heckful_Toppings{
    public Heckful_PremiumToppings(String name, boolean isExtra) {
        super(name, isExtra);
    }

    @Override
    public double getPrice(SandwichSize size) {
        double basePrice = switch (name.toLowerCase()) {
            case "bacon", "steak", "ham", "chicken", "salami", "roast beef" -> switch (size) {
                case FOUR_INCH -> 1.00;
                case EIGHT_INCH -> 2.00;
                case TWELVE_INCH -> 3.00;
            };
            case "cheddar", "swiss", "american", "provolone" -> switch (size) {
                case FOUR_INCH -> 0.75;
                case EIGHT_INCH -> 1.50;
                case TWELVE_INCH -> 2.25;
            };
            default -> 0;
        };

        if (isExtra) {
            basePrice += switch (name.toLowerCase()) {
                case "bacon", "steak", "ham", "chicken", "salami", "roast beef" -> switch (size) {
                    case FOUR_INCH -> 0.50;
                    case EIGHT_INCH -> 1.00;
                    case TWELVE_INCH -> 1.50;
                };
                case "cheddar", "swiss", "american", "provolone" -> switch (size) {
                    case FOUR_INCH -> 0.30;
                    case EIGHT_INCH -> 0.60;
                    case TWELVE_INCH -> 0.90;
                };
                default -> 0;
            };
        }

        return basePrice;
    }
}