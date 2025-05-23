package com.pluralsight.Heck_Sandwich;


import com.pluralsight.Sandwich_Emuns.Heck_Bread_Types;
import com.pluralsight.Sandwich_Emuns.Heck_Sandwich_Sizes;
import com.pluralsight.Sandwich_Emuns.Heck_Signature_Type;
import com.pluralsight.Sandwich_Emuns.Heck_Toppings_Type;

public class Heck_Signature_Sandwich extends One_Heck_Of_Sandwich_A_Class {

    public Heck_Signature_Sandwich(Heck_Signature_Type signatureType) {
        // Signature sandwiches are always 8", white bread,and toasted
        super(Heck_Sandwich_Sizes.EIGHT_INCH, Heck_Bread_Types.WHITE, true);

        switch (signatureType) {
            case BLT:
                addTopping(new Heck_Toppings("Bacon", Heck_Toppings_Type.MEAT, false));
                addTopping(new Heck_Toppings("Cheddar", Heck_Toppings_Type.CHEESE, false));
                addTopping(new Heck_Toppings("Lettuce", Heck_Toppings_Type.REGULAR, false));
                addTopping(new Heck_Toppings("Tomato", Heck_Toppings_Type.REGULAR, false));
                addTopping(new Heck_Toppings("Ranch", Heck_Toppings_Type.REGULAR, false));
                break;

            case PHILLY_CHEESESTEAK:
                addTopping(new Heck_Toppings("Steak", Heck_Toppings_Type.MEAT, false));
                addTopping(new Heck_Toppings("American", Heck_Toppings_Type.CHEESE, false));
                addTopping(new Heck_Toppings("Peppers", Heck_Toppings_Type.REGULAR, false));
                addTopping(new Heck_Toppings("Mayo", Heck_Toppings_Type.REGULAR, false));
                break;
        }
    }
}