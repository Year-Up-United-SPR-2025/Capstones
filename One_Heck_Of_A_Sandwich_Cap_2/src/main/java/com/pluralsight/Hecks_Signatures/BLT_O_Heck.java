package com.pluralsight.Hecks_Signatures;

import com.pluralsight.Heck_Emuns.BreadType;
import com.pluralsight.Heck_Emuns.SandwichSize;
import com.pluralsight.Heck_Toppings.Heckful_PremiumToppings;
import com.pluralsight.UI_OF_THE_DANGED.ColorCodes;

public class BLT_O_Heck extends Hecks_Signature {
    public BLT_O_Heck(){
        super(ColorCodes.BRIGHT_RED + "🥓 BLT O Heck" + ColorCodes.RESET, SandwichSize.EIGHT_INCH, BreadType.WHITE, true);
        addTopping(new Heckful_PremiumToppings(ColorCodes.BRIGHT_RED + "🥓 Bacon" + ColorCodes.RESET, false));
        addTopping(new Heckful_PremiumToppings(ColorCodes.BRIGHT_YELLOW + "🧀 Cheddar" + ColorCodes.RESET, false));
        addTopping(new Heckful_PremiumToppings(ColorCodes.BRIGHT_GREEN + "🥬 Lettuce" + ColorCodes.RESET, false));
        addTopping(new Heckful_PremiumToppings(ColorCodes.RED + "🍅 Tomatoes" + ColorCodes.RESET, false));
        addTopping(new Heckful_PremiumToppings(ColorCodes.WHITE + "🥗 Ranch" + ColorCodes.RESET, false));
    }
}