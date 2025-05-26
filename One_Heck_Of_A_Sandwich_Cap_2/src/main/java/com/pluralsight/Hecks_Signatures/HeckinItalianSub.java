package com.pluralsight.Hecks_Signatures;

import com.pluralsight.Heck_Emuns.BreadType;
import com.pluralsight.Heck_Emuns.SandwichSize;
import com.pluralsight.Heck_Toppings.Heckful_PremiumToppings;
import com.pluralsight.Heck_Toppings.Heckful_RegularToppings;

public class HeckinItalianSub extends Hecks_Signature {
    public HeckinItalianSub() {
        super("Italian Sub", SandwichSize.EIGHT_INCH, BreadType.ITALIAN_HERB_AND_CHEESE, false);
        addTopping(new Heckful_PremiumToppings("Salami", false));
        addTopping(new Heckful_PremiumToppings("Pepperoni", false));
        addTopping(new Heckful_PremiumToppings("Provolone", false));
        addTopping(new Heckful_RegularToppings("Lettuce", false));
        addTopping(new Heckful_RegularToppings("Tomato", false));
        addTopping(new Heckful_RegularToppings("Oil & Vinegar", false));
    }
}
