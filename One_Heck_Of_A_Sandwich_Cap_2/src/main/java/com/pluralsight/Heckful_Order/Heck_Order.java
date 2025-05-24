package com.pluralsight.Heckful_Order;

import com.pluralsight.One_Heck_of_a_Sandwich_Package.Heckful_Sandwich;
import com.pluralsight.Sides.Chips;
import com.pluralsight.Sides.Drink;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Heck_Order {
    private List<Heckful_Sandwich> sandwiches = new ArrayList<>();
    private List<Drink> drinks = new ArrayList<>();
    private List<Chips> chips = new ArrayList<>();
    private LocalDateTime timestamp;

    public Heck_Order() {
        this.timestamp = LocalDateTime.now();
    }

    public void addSandwich(Heckful_Sandwich s) { sandwiches.add(s); }
    public void addDrink(Drink d) { drinks.add(d); }
    public void addChips(Chips c) { chips.add(c); }

    public double getTotal() {
        double total = 0;
        for (Heckful_Sandwich s : sandwiches) total += s.getTotalPrice();
        for (Drink d : drinks) total += d.getPrice();
        for (Chips c : chips) total += c.getPrice();
        return total;
    }

    public String generateReceipt() {
        StringBuilder sb = new StringBuilder();
        sb.append("==== One Heck Of A Sandwich Receipt ==== 🧾\n");
        sb.append("Time: ").append(timestamp).append("\n\n");

        for (Heckful_Sandwich s : sandwiches) {
            sb.append("Sandwich:\n").append(s.getDescription()).append("\n\n");
        }

        for (Drink d : drinks) {
            sb.append("Drink: ").append(d.getDescription()).append("\n");
        }

        for (Chips c : chips) {
            sb.append("Chips: ").append(c.getDescription()).append("\n");
        }

        sb.append("\nTOTAL: $").append(String.format("%.2f", getTotal())).append("\n");
        sb.append("=========================================\n");

        return sb.toString();
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }
}
