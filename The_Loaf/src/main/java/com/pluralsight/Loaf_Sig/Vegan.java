package com.pluralsight.Loaf_Sig;

import com.pluralsight.Loaf_Emuns.BreadType;
import com.pluralsight.Loaf_Emuns.SandwichSize;
import com.pluralsight.Loaf_Toppings.Loaf_PremiumToppings;
import com.pluralsight.UI.ColorCodes;

public class Vegan  extends  Signature{
    public Vegan(){
        super(ColorCodes.GREEN + "Vegan" + ColorCodes.RESET, SandwichSize.EIGHT_INCH, BreadType.WHITE, true);
        addTopping(new Loaf_PremiumToppings(ColorCodes.WHITE +"🤍Tofu" + ColorCodes.RESET , false));
        addTopping(new Loaf_PremiumToppings(ColorCodes.FOREST_GREEN + "Lettuce" + ColorCodes.RESET, false));
    }
}
