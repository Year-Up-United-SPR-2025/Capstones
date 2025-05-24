package com.pluralsight.Hecks_Signatures;

import com.pluralsight.Heck_Emuns.BreadType;
import com.pluralsight.Heck_Emuns.SandwichSize;
import com.pluralsight.Heck_Toppings.Heckful_PremiumToppings;

public class Heck_O_Alot_Of_PhillyCheeseSteak extends Hecks_Signature{
    public Heck_O_Alot_Of_PhillyCheeseSteak(){
        super("Philly Cheese Steak", SandwichSize.EIGHT_INCH, BreadType.WHITE, true);
        addTopping(new Heckful_PremiumToppings("Steak", false));
        addTopping(new Heckful_PremiumToppings("American", false));
        addTopping(new Heckful_PremiumToppings("Peppers", false));
        addTopping(new Heckful_PremiumToppings("Mayo", false));
    }
}
