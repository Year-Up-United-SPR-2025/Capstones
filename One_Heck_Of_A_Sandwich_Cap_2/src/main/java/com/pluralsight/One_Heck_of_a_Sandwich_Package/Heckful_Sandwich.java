package com.pluralsight.One_Heck_of_a_Sandwich_Package;

import com.pluralsight.Heck_Emuns.BreadType;
import com.pluralsight.Heck_Emuns.SandwichSize;
import com.pluralsight.Heck_Toppings.Heckful_Toppings;

import java.util.ArrayList;
import java.util.List;

public class Heckful_Sandwich {
    private SandwichSize size;
    private BreadType bread;
    private boolean toasted;
    private List<Heckful_Toppings> toppings;

    public Heckful_Sandwich(SandwichSize size, BreadType bread, boolean toasted) {
        this.size = size;
        this.bread = bread;
        this.toasted = toasted;
        this.toppings = new ArrayList<>();
    }

    public void addTopping(Heckful_Toppings topping) {
        toppings.add(topping);
    }

    public double getBasePrice() {
        return switch (size) {
            case FOUR_INCH -> 5.50;
            case EIGHT_INCH -> 7.00;
            case TWELVE_INCH -> 8.50;
        };
    }

    public double getToppingsPrice() {
        return toppings.stream()
                .mapToDouble(t -> t.getPrice(size))
                .sum();
    }

    public double getTotalPrice() {
        return getBasePrice() + getToppingsPrice();
    }

    public String getDescription() {
        StringBuilder sb = new StringBuilder();
        sb.append(size).append(" ").append(bread).append(" sandwich").append(toasted ? " (Toasted)" : "");
        sb.append("\nToppings:\n");
        for (Heckful_Toppings t : toppings) {
            sb.append("- ").append(t.getName()).append(t.isExtra() ? " (Extra)" : "").append("\n");
        }
        sb.append("Total Price: $").append(String.format("%.2f", getTotalPrice()));
        return sb.toString();
    }
}
