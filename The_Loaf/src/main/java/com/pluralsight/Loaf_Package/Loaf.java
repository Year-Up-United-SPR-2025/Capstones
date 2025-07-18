package com.pluralsight.Loaf_Package;

import com.pluralsight.Loaf_Emuns.BreadType;
import com.pluralsight.Loaf_Emuns.SandwichSize;
import com.pluralsight.Loaf_Toppings.Loaf_PremiumToppings;
import com.pluralsight.Loaf_Toppings.Loaf_Toppings;

import java.util.ArrayList;
import java.util.List;

public class Loaf {
    private SandwichSize size;
    private BreadType bread;
    private boolean toasted;
    private List<Loaf_Toppings> toppings;
    private double additionalCharges; // Track additional surcharges

    public Loaf(SandwichSize size, BreadType bread, boolean toasted) {
        this.size = size;
        this.bread = bread;
        this.toasted = toasted;
        this.toppings = new ArrayList<>();
        this.additionalCharges = 0.0;
    }

    public void addTopping(Loaf_Toppings topping) {
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
        for (Loaf_Toppings t : toppings) {
            if (Loaf_Toppings topping instanceof Loaf_PremiumToppings)
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

