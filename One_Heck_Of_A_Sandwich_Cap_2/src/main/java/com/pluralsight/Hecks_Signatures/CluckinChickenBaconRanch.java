package com.pluralsight.Hecks_Signatures;

import com.pluralsight.Heck_Emuns.BreadType;
import com.pluralsight.Heck_Emuns.SandwichSize;
import com.pluralsight.Heck_Toppings.Heckful_PremiumToppings;
import com.pluralsight.Heck_Toppings.Heckful_RegularToppings;
import com.pluralsight.UI_OF_THE_DANGED.ColorCodes;

public class CluckinChickenBaconRanch extends Hecks_Signature {
    public CluckinChickenBaconRanch() {
        super(ColorCodes.BROWN_RGB + "🍗 Cluckin Chicken Bacon Ranch" + ColorCodes.RESET, SandwichSize.EIGHT_INCH, BreadType.WHEAT, true);
        addTopping(new Heckful_PremiumToppings(ColorCodes.BROWN_RGB + "🍗 Grilled Chicken" + ColorCodes.RESET, false));
        addTopping(new Heckful_PremiumToppings(ColorCodes.BRIGHT_RED + "🥓 Bacon" + ColorCodes.RESET, false));
        addTopping(new Heckful_PremiumToppings(ColorCodes.BRIGHT_YELLOW + "🧀 Cheddar" + ColorCodes.RESET, false));
        addTopping(new Heckful_RegularToppings(ColorCodes.WHITE + "🥗 Ranch" + ColorCodes.RESET, false));
        addTopping(new Heckful_RegularToppings(ColorCodes.BRIGHT_GREEN + "🥬 Lettuce" + ColorCodes.RESET, false));
        addTopping(new Heckful_RegularToppings(ColorCodes.YELLOW + "🧅 Onion" + ColorCodes.RESET, false));
    }
}