package com.pluralsight.Loaf_Sig;


import com.pluralsight.Loaf_Emuns.BreadType;
import com.pluralsight.Loaf_Emuns.SandwichSize;
import com.pluralsight.Loaf_Toppings.Loaf_PremiumToppings;
import com.pluralsight.Loaf_Toppings.Loaf_RegularToppings;
import com.pluralsight.UI.ColorCodes;

public class Italian_Sub extends Signature {
    public Italian_Sub() {
        super(ColorCodes.BRIGHT_RED + "Italian Sub" + ColorCodes.RESET,
                SandwichSize.EIGHT_INCH,
                BreadType.ITALIAN_HERB_AND_CHEESE,
                false);

        // Premium toppings 🧀🥩
        addTopping(new Loaf_PremiumToppings(ColorCodes.GOLD + "Salami 🥩" + ColorCodes.RESET, false));
        addTopping(new Loaf_PremiumToppings(ColorCodes.RED + "Pepperoni 🔥" + ColorCodes.RESET, false));
        addTopping(new Loaf_PremiumToppings( ColorCodes.YELLOW + "Provolone 🧀" + ColorCodes.RESET, false));

        // Regular toppings 🥗🍅
        addTopping(new Loaf_RegularToppings(ColorCodes.RED + "Tomato 🍅" + ColorCodes.RESET, false));
        addTopping(new Loaf_RegularToppings(ColorCodes.CYAN + "Oil & Vinegar 🧴" + ColorCodes.RESET, false));
    }
}
