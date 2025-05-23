package com.pluralsight;


import com.pluralsight.Heck_Sandwich.One_Heck_Of_Sandwich_A_Class;
import com.pluralsight.UI.One_Heck_of_A_Custom_Sandwich;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("🥪 Welcome to One Heck of a Sandwich Shop!");

        while (running) {
            System.out.println("\nHome Screen");
            System.out.println("1) New Order");
            System.out.println("0) Exit");
            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    startNewOrder(scanner);
                    break;
                case "0":
                    running = false;
                    System.out.println("Goodbye! Come back for more sandwiches!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }

        scanner.close();
    }

    private static void startNewOrder(Scanner scanner) {
        List<One_Heck_Of_Sandwich_A_Class> sandwiches = new ArrayList<>();
        boolean ordering = true;

        while (ordering) {
            System.out.println("\nOrder Screen");
            System.out.println("1) Add Sandwich");
            System.out.println("4) Checkout");
            System.out.println("0) Cancel Order");
            System.out.print("Enter your choice: ");
            String orderChoice = scanner.nextLine();

            switch (orderChoice) {
                case "1":
                    One_Heck_Of_Sandwich_A_Class sandwich = One_Heck_of_A_Custom_Sandwich.build(scanner);
                    sandwiches.add(sandwich);
                    System.out.println("Sandwich added!");
                    break;

                case "4":
                    checkout(sandwiches);
                    ordering = false;
                    break;

                case "0":
                    System.out.println("Order cancelled.");
                    ordering = false;
                    break;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }

    private static void checkout(List<One_Heck_Of_Sandwich_A_Class> sandwiches) {
        System.out.println("\n🧾 Order Summary:");
        double total = 0.0;

        for (int i = 0; i < sandwiches.size(); i++) {
            System.out.println("\nSandwich #" + (i + 1));
            sandwiches.get(i).printSandwichDetails();
            total += sandwiches.get(i).calculateTotalPrice();
        }

        System.out.printf("\nTOTAL PRICE: $%.2f%n", total);
        System.out.println("Thank you for your order!");
        // Save to file logic could go here
    }
}