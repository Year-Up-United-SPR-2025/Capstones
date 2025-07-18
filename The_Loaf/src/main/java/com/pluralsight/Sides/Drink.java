/** package com.pluralsight.Sides;

import com.pluralsight.Loaf_Emuns.DrinkSize;
import com.pluralsight.Loaf_Emuns.DrinkTypes;

public class Drink {
    private DrinkSize size;
    private String flavor;

    public Drink(DrinkSize size, String flavor) {
        this.size = size;
        this.flavor = flavor;
    }

    public double getPrice() {
        return switch (size) {
            case SMALL -> 2.00;
            case MEDIUM -> 2.50;
            case LARGE -> 3.00;
            case EXTREME -> 4.00;
        };
    }

    public String getDescription() {
        return size + " " + flavor + " - $" + getPrice();
    }
}
**/

package com.pluralsight.Sides;

import com.pluralsight.Loaf_Emuns.DrinkSize;
import com.pluralsight.Loaf_Emuns.DrinkTypes;

public class Drink {
    private DrinkSize size;
    private DrinkTypes flavor;

    public Drink(DrinkSize size, DrinkTypes flavor) {
        this.size = size;
        this.flavor = flavor;
    }

    public Drink(DrinkSize size, String flavor) {
    }

    public DrinkSize getSize() {
        return size;
    }

    public DrinkTypes getFlavor() {
        return flavor;
    }

    public double getPrice() {
        return switch (size) {
            case SMALL -> 2.00;
            case MEDIUM -> 2.50;
            case LARGE -> 3.00;
            case EXTREME -> 4.00;
        };
    }

    public String getDescription() {
        return size + " " + flavor + " - $" + String.format("%.2f", getPrice());
    }
}

