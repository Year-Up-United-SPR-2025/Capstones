package com.pluralsight.Hecks_Signatures;

import com.pluralsight.Heck_Emuns.BreadType;
import com.pluralsight.Heck_Emuns.SandwichSize;
import com.pluralsight.Heck_Toppings.Heckful_PremiumToppings;
import com.pluralsight.Heck_Toppings.Heckful_RegularToppings;

public class CluckinChickenBaconRanch extends Hecks_Signature {
    public CluckinChickenBaconRanch() {
        super("Chicken Bacon Ranch", SandwichSize.EIGHT_INCH, BreadType.WHEAT, true);
        addTopping(new Heckful_PremiumToppings("Grilled Chicken", false));
        addTopping(new Heckful_PremiumToppings("Bacon", false));
        addTopping(new Heckful_PremiumToppings("Cheddar", false));
        addTopping(new Heckful_RegularToppings("Ranch", false));
        addTopping(new Heckful_RegularToppings("Lettuce", false));
        addTopping(new Heckful_RegularToppings("Onion", false));
    }
}
