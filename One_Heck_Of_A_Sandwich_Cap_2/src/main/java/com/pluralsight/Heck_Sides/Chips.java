package com.pluralsight.Heck_Sides;

import com.pluralsight.Sandwich_Emuns.ChipsType;

public class Chips {
    private ChipsType type;

    public Chips(ChipsType type) {
        this.type = type;
    }

    public ChipsType getType() {
        return type;
    }

    public void setType(ChipsType type) {
        this.type = type;
    }

    public double getPrice() {
        return type.getPrice();
    }

    public String getDetails() {
        return "Chips: " + type.name() + " ($" + String.format("%.2f", getPrice()) + ")";
    }
}