package com.pluralsight.Loaf_Sig;


import com.pluralsight.Loaf_Emuns.BreadType;
import com.pluralsight.Loaf_Emuns.SandwichSize;
import com.pluralsight.Loaf_Toppings.Loaf_PremiumToppings;
import com.pluralsight.UI.ColorCodes;

public class PhillyCheese extends Signature {
    public PhillyCheese() {
        super(ColorCodes.RED + "🥩 Heck O Alot Of Philly Cheese Steak" + ColorCodes.RESET, SandwichSize.TWELVE_INCH, BreadType.WHITE, true);
        addTopping(new Loaf_PremiumToppings(ColorCodes.RED + "🥩 Steak" + ColorCodes.RESET, false));
        addTopping(new Loaf_PremiumToppings(ColorCodes.BRIGHT_YELLOW + "🧀 American" + ColorCodes.RESET, false));
        addTopping(new Loaf_PremiumToppings(ColorCodes.BRIGHT_RED + "🌶️ Peppers" + ColorCodes.RESET, false));
        addTopping(new Loaf_PremiumToppings(ColorCodes.ANTIQUE_WHITE + "🥪 Mayo" + ColorCodes.RESET, false));
    }
}
