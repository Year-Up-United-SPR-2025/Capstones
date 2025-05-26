package com.pluralsight.Hecks_Signatures;

import com.pluralsight.One_Heck_of_a_Sandwich_Package.Heckful_Sandwich;

import java.util.ArrayList;
import java.util.List;

public class SignatureFactory {

    public static List<Heckful_Sandwich> getAllSignatureSandwiches() {
        List<Heckful_Sandwich> signatures = new ArrayList<>();
        signatures.add(new BLT_O_Heck());
        signatures.add(new Heck_O_Alot_Of_PhillyCheeseSteak());
        return signatures;
    }

    public static Heckful_Sandwich getSignatureByIndex(int index) {
        List<Heckful_Sandwich> all = getAllSignatureSandwiches();
        if (index >= 0 && index < all.size()) {
            return all.get(index);
        }
        return null;
    }
}
