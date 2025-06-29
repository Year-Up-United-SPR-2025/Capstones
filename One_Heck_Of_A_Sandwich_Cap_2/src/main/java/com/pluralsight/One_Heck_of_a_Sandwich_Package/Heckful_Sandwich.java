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
    private double additionalCharges; // Track additional surcharges

    public Heckful_Sandwich(SandwichSize size, BreadType bread, boolean toasted) {
        this.size = size;
        this.bread = bread;
        this.toasted = toasted;
        this.toppings = new ArrayList<>();
        this.additionalCharges = 0.0;
    }

    public void addTopping(Heckful_Toppings topping) {
        toppings.add(topping);
    }

    // Method to add the 50-cent surcharge
    public void addSurcharge(double amount) {
        this.additionalCharges += amount;
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

    public double getAdditionalCharges() {
        return additionalCharges;
    }

    public double getTotalPrice() {
        return getBasePrice() + getToppingsPrice() + additionalCharges;
    }

    public String getDescription() {
        StringBuilder sb = new StringBuilder();
        sb.append(size).append(" ").append(bread).append(" Sandwich").append(toasted ? " (Toasted)" : "");
        sb.append("\nToppings:\n");
        for (Heckful_Toppings t : toppings) {
            sb.append("- ").append(t.getName()).append(t.isExtra() ? " (Extra)" : "").append("\n");
        }
        if (additionalCharges > 0) {
            sb.append("Additional Charges: $").append(String.format("%.2f", additionalCharges)).append("\n");
        }
        sb.append("Total Price: $").append(String.format("%.2f", getTotalPrice()));
        return sb.toString();
    }

    public String getName() {
        return size + " " + bread + (toasted ? " (Toasted)" : "") + " Sandwich";
    }

    public SandwichSize getSize() {
        return size;
    }

    public BreadType getBreadType() {
        return bread;
    }

    public boolean isToasted() {
        return toasted;
    }
}