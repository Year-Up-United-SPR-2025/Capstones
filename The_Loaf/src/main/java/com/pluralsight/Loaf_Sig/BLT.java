package com.pluralsight.Loaf_Sig;

import com.pluralsight.Loaf_Emuns.BreadType;
import com.pluralsight.Loaf_Emuns.SandwichSize;
import com.pluralsight.Loaf_Toppings.Loaf_PremiumToppings;
import com.pluralsight.UI.ColorCodes;

public class BLT extends Signature {
    public BLT(){
        super(ColorCodes.BRIGHT_RED + "🥓 BLT O Heck" + ColorCodes.RESET, SandwichSize.EIGHT_INCH, BreadType.WHITE, true);
        addTopping(new Loaf_PremiumToppings(ColorCodes.BRIGHT_RED + "🥓 Bacon" + ColorCodes.RESET, false));
        addTopping(new Loaf_PremiumToppings(ColorCodes.BRIGHT_YELLOW + "🧀 Cheddar" + ColorCodes.RESET, false));
        addTopping(new Loaf_PremiumToppings(ColorCodes.BRIGHT_GREEN + "🥬 Lettuce" + ColorCodes.RESET, false));
        addTopping(new Loaf_PremiumToppings(ColorCodes.RED + "🍅 Tomatoes" + ColorCodes.RESET, false));
        addTopping(new Loaf_PremiumToppings(ColorCodes.WHITE + "🥗 Ranch" + ColorCodes.RESET, false));
    }
}