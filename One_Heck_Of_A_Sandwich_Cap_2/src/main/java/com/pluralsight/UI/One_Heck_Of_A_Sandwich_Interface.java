package com.pluralsight.UI;

import com.pluralsight.Heck_Sandwich.*;
import com.pluralsight.Heck_Sides.Chips;
import com.pluralsight.Heck_Sides.Drink;
import com.pluralsight.Sandwich_Emuns.*;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class One_Heck_Of_A_Sandwich_Interface {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            System.out.println("\n--- Welcome to One Heck of a Sandwich Shop ---");
            System.out.println("1) New Order");
            System.out.println("0) Exit");
            System.out.print("Choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    startOrder();
                    break;
                case "0":
                    running = false;
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid input.");
            }
        }
    }

    private static void startOrder() {
        List<One_Heck_Of_Sandwich_A_Class> sandwiches = new ArrayList<>();
        List<Drink> drinks = new ArrayList<>();
        List<Chips> chips = new ArrayList<>();

        boolean ordering = true;
        while (ordering) {
            System.out.println("\n--- One Heck of A Menu ---");
            System.out.println("1) Add Sandwich");
            System.out.println("2) Add Drink");
            System.out.println("3) Add Chips");
            System.out.println("4) Checkout");
            System.out.println("0) Cancel Order");
            System.out.print("Choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    sandwiches.add(buildSandwich());
                    break;
                case "2":
                    drinks.add(buildDrink());
                    break;
                case "3":
                    chips.add(buildChips());
                    break;
                case "4":
                    checkout(sandwiches, drinks, chips);
                    ordering = false;
                    break;
                case "0":
                    System.out.println("Order cancelled.");
                    ordering = false;
                    break;
                default:
                    System.out.println("Invalid input.");
            }
        }
    }

    private static One_Heck_Of_Sandwich_A_Class buildSandwich() {
        System.out.println("1) Signature Sandwich\n2) Build Your Own");
        String type = scanner.nextLine();

        if (type.equals("1")) {
            System.out.println("Choose a signature:");
            for (Heck_Signature_Type s : Heck_Signature_Type.values()) {
                System.out.println("- " + s.name());
            }
            String selected = scanner.nextLine().toUpperCase();
            return new Heck_Signature_Sandwich(Heck_Signature_Type.valueOf(selected));
        } else {
            return One_Heck_of_A_Custom_Sandwich.build(scanner); // A class you'll create for manual sandwich steps
        }
    }

    private static Drink buildDrink() {
        System.out.println("Choose drink size (SMALL, MEDIUM, LARGE):");
        Heck_Drink_Sizes size = Heck_Drink_Sizes.valueOf(scanner.nextLine().toUpperCase());

        System.out.print("Enter flavor: ");
        String flavor = scanner.nextLine();

        return new Drink(size, flavor);
    }

    private static Chips buildChips() {
        System.out.print("Enter chip flavor: ");
        return new Chips(scanner.nextLine());
    }

    private static void checkout(List<One_Heck_Of_Sandwich_A_Class> sandwiches,
                                 List<Drink> drinks,
                                 List<Chips> chips) {
        double total = 0;

        System.out.println("\n--- Order Summary ---");

        for (One_Heck_Of_Sandwich_A_Class s : sandwiches) {
            System.out.println(s);
            total += s.calculateTotalPrice();
        }

        for (Drink d : drinks) {
            System.out.println("- Drink: " + d.getFlavor() + " (" + d.getSize() + ") - $" + d.getSize().getPrice());
            total += d.getSize().getPrice();
        }

        for (Chips c : chips) {
            System.out.println("- Chips: " + c.getType() + " - $1.50");
            total += 1.50;
        }

        System.out.printf("Total: $%.2f\n", total);
        System.out.print("1) Confirm\n0) Cancel: ");
        String confirm = scanner.nextLine();

        if (confirm.equals("1")) {
            saveReceipt(sandwiches, drinks, chips, total);
            System.out.println("Order confirmed and saved.");
        } else {
            System.out.println("Order cancelled.");
        }
    }

    private static void saveReceipt(List<One_Heck_Of_Sandwich_A_Class> sandwiches,
                                    List<Drink> drinks,
                                    List<Chips> chips,
                                    double total) {
        try {
            String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss"));
            String filename = "One_Heck_of_A_Receipts" + timestamp + ".txt";

            FileWriter writer = new FileWriter(filename);
            writer.write("=== One Heck of A Receipt ===\n");

            for (One_Heck_Of_Sandwich_A_Class s : sandwiches) {
                writer.write(s.toString() + "\n\n");
            }

            for (Drink d : drinks) {
                writer.write("- Drink: " + d.getFlavor() + " (" + d.getSize() + ") - $" + d.getSize().getPrice() + "\n");
            }

            for (Chips c : chips) {
                writer.write("- Chips: " + c.getType() + " - $1.50\n");
            }

            writer.write(String.format("\nTotal: $%.2f\n", total));
            writer.close();
        } catch (IOException e) {
            System.out.println("Failed to save receipt.");
        }
    }
}
