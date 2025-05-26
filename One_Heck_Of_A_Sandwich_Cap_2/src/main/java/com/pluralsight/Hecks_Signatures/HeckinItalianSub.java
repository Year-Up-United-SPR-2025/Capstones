package com.pluralsight.Hecks_Signatures;

import com.pluralsight.Heck_Emuns.BreadType;
import com.pluralsight.Heck_Emuns.SandwichSize;
import com.pluralsight.Heck_Toppings.Heckful_PremiumToppings;
import com.pluralsight.Heck_Toppings.Heckful_RegularToppings;
import com.pluralsight.UI_OF_THE_DANGED.ColorCodes;

public class HeckinItalianSub extends Hecks_Signature {
    public HeckinItalianSub() {
        super(ColorCodes.BRIGHT_RED + "Heckin' Italian Sub" + ColorCodes.RESET,
                SandwichSize.EIGHT_INCH,
                BreadType.ITALIAN_HERB_AND_CHEESE,
                false);

        // Premium toppings 🧀🥩
        addTopping(new Heckful_PremiumToppings(ColorCodes.GOLD + "Salami 🥩" + ColorCodes.RESET, false));
        addTopping(new Heckful_PremiumToppings(ColorCodes.RED + "Pepperoni 🔥" + ColorCodes.RESET, false));
        addTopping(new Heckful_PremiumToppings(ColorCodes.YELLOW + "Provolone 🧀" + ColorCodes.RESET, false));

        // Regular toppings 🥗🍅
        addTopping(new Heckful_RegularToppings(ColorCodes.GREEN + "Lettuce 🥬" + ColorCodes.RESET, false));
        addTopping(new Heckful_RegularToppings(ColorCodes.RED + "Tomato 🍅" + ColorCodes.RESET, false));
        addTopping(new Heckful_RegularToppings(ColorCodes.CYAN + "Oil & Vinegar 🧴" + ColorCodes.RESET, false));
    }
}
