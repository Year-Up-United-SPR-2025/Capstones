package com.pluralsight.Sides;

import com.pluralsight.Loaf_Emuns.ChipTypes;

public class Chips {
    private ChipTypes type;

    public Chips(String type) {
        this.type = ChipTypes.valueOf(type.toUpperCase());
    }

    public double getPrice() {
            return switch (type){
                case LAYS, DORITOS, SUN_CHIPS -> 1.50;
            };
    }

    public String getDescription() {
        return type + " Chips - $1.50";
    }
}
