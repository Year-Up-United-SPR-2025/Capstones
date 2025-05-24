package com.pluralsight.Hecks_Signatures;

import com.pluralsight.Heck_Emuns.BreadType;
import com.pluralsight.Heck_Emuns.SandwichSize;
import com.pluralsight.Heck_Toppings.Heckful_PremiumToppings;

public class BLT_O_Heck extends Hecks_Signature {
    public BLT_O_Heck(){
        super("BLT", SandwichSize.EIGHT_INCH, BreadType.WHITE, true);
        addTopping(new Heckful_PremiumToppings("Bacon", false));
        addTopping(new Heckful_PremiumToppings("Cheddar", false));
        addTopping(new Heckful_PremiumToppings("Lettuce", false));
        addTopping(new Heckful_PremiumToppings("Tomatoes", false));
        addTopping(new Heckful_PremiumToppings("Ranch", false));
    }
}
