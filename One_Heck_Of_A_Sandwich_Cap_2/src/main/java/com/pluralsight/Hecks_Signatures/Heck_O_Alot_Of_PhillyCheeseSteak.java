package com.pluralsight.Hecks_Signatures;

import com.pluralsight.Heck_Emuns.BreadType;
import com.pluralsight.Heck_Emuns.SandwichSize;
import com.pluralsight.Heck_Toppings.Heckful_PremiumToppings;
import com.pluralsight.UI_OF_THE_DANGED.ColorCodes;

public class Heck_O_Alot_Of_PhillyCheeseSteak extends Hecks_Signature {
    public Heck_O_Alot_Of_PhillyCheeseSteak() {
        super(ColorCodes.RED + "🥩 Heck O Alot Of Philly Cheese Steak" + ColorCodes.RESET, SandwichSize.EIGHT_INCH, BreadType.WHITE, true);
        addTopping(new Heckful_PremiumToppings(ColorCodes.RED + "🥩 Steak" + ColorCodes.RESET, false));
        addTopping(new Heckful_PremiumToppings(ColorCodes.BRIGHT_YELLOW + "🧀 American" + ColorCodes.RESET, false));
        addTopping(new Heckful_PremiumToppings(ColorCodes.BRIGHT_RED + "🌶️ Peppers" + ColorCodes.RESET, false));
        addTopping(new Heckful_PremiumToppings(ColorCodes.WHITE + "🥪 Mayo" + ColorCodes.RESET, false));
    }
}