package com.pluralsight.Heck_Sandwich;

import com.pluralsight.Sandwich_Emuns.*;

import java.util.ArrayList;
import java.util.List;

public class One_Heck_Of_Sandwich_A_Class {
    private Heck_Sandwich_Sizes size;
    private Heck_Bread_Types bread;
    private boolean toasted;
    private List<Heck_Toppings> toppings;

    public One_Heck_Of_Sandwich_A_Class(Heck_Sandwich_Sizes size, Heck_Bread_Types bread, boolean toasted) {
        this.size = size;
        this.bread = bread;
        this.toasted = toasted;
        this.toppings = new ArrayList<>();
    }

    public void addTopping(Heck_Toppings topping) {
        toppings.add(topping);
    }

    public double calculateTotalPrice() {
        double total = size.getBasePrice();

        for (Heck_Toppings topping : toppings) {
            switch (topping.getType()) {
                case MEAT:
                    total += topping.isExtra() ? size.getExtraMeatPrice() : size.getMeatPrice();
                    break;
                case CHEESE:
                    total += topping.isExtra() ? size.getExtraCheesePrice() : size.getCheesePrice();
                    break;
                case REGULAR:
                    // Regular toppings are free
                    break;
            }
        }

        return total;
    }

    public void printSandwichDetails() {
        System.out.println("Sandwich Details:");
        System.out.println("- Size: " + size);
        System.out.println("- Bread: " + bread);
        System.out.println("- Toasted: " + (toasted ? "Yes" : "No"));
        System.out.println("- Toppings:");
        for (Heck_Toppings topping : toppings) {
            String extra = (topping.isExtra()) ? " (Extra)" : "";
            System.out.println("  * " + topping.getName() + " - " + topping.getType() + extra);
        }
        System.out.printf("- Total Price: $%.2f%n", calculateTotalPrice());
    }

    // Getters
    public Heck_Sandwich_Sizes getSize() {
        return size;
    }

    public Heck_Bread_Types getBread() {
        return bread;
    }

    public boolean isToasted() {
        return toasted;
    }

    public List<Heck_Toppings> getToppings() {
        return toppings;
    }
}
