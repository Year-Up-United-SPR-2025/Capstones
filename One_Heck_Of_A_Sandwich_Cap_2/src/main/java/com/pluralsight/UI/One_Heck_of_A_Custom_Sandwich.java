package com.pluralsight.UI;

import com.pluralsight.Heck_Sandwich.Heck_Toppings;
import com.pluralsight.Heck_Sandwich.One_Heck_Of_Sandwich_A_Class;
import com.pluralsight.Sandwich_Emuns.Heck_Bread_Types;
import com.pluralsight.Sandwich_Emuns.Heck_Sandwich_Sizes;
import com.pluralsight.Sandwich_Emuns.Heck_Toppings_Type;

import java.util.Scanner;

public class One_Heck_of_A_Custom_Sandwich {
    public static One_Heck_Of_Sandwich_A_Class build(Scanner scanner) {
        // Choose size
        System.out.println("Choose sandwich size (Four-Inch Eight-Inch, Twelve-Inch):");
        Heck_Sandwich_Sizes size = Heck_Sandwich_Sizes.valueOf(scanner.nextLine().toUpperCase());

        // Choose bread
        System.out.println("Choose bread type (White, Wheat, Rye, Wrap):");
        Heck_Bread_Types bread = Heck_Bread_Types.valueOf(scanner.nextLine().toUpperCase());

        // Toasted?
        System.out.print("Would you like it toasted? (yes/no): ");
        boolean toasted = scanner.nextLine().trim().equalsIgnoreCase("yes");

        // Create sandwich
        One_Heck_Of_Sandwich_A_Class sandwich = new One_Heck_Of_Sandwich_A_Class(size, bread, toasted);

        // Add toppings
        System.out.println("Add toppings (type 'done' when finished):");

        while (true) {
            System.out.print("Enter topping name: ");
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("done")) break;

            System.out.print("Topping type (Meat, Cheese, Regular): ");
            Heck_Toppings_Type type = Heck_Toppings_Type.valueOf(scanner.nextLine().toUpperCase());

            boolean isExtra = false;
            if (type == Heck_Toppings_Type.MEAT || type == Heck_Toppings_Type.CHEESE) {
                System.out.print("Is this an extra? (yes/no): ");
                isExtra = scanner.nextLine().trim().equalsIgnoreCase("yes");
            }

            sandwich.addTopping(new Heck_Toppings(name, type, isExtra));
        }

        return sandwich;
    }
}