package com.pluralsight.Sides;

import com.pluralsight.Loaf_Emuns.ChipTypes;

import static com.pluralsight.Loaf_Emuns.ChipTypes.*;

public class Chips {
    private String type;
    private String Chip_Types;

    public Chips(String type) {
        this.type = type;
    }

    public double getPrice() {
            return 1.50;
    }



    public String getDescription() {
        return type + " Chips - $1.50";
    }
}
