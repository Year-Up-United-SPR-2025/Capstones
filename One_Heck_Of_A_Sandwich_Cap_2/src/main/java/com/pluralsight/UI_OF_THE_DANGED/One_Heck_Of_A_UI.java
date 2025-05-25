package com.pluralsight.UI_OF_THE_DANGED;

import com.pluralsight.Heck_Emuns.BreadType;
import com.pluralsight.Heck_Emuns.DrinkSize;
import com.pluralsight.Heck_Emuns.SandwichSize;
import com.pluralsight.Heck_Toppings.Heckful_PremiumToppings;
import com.pluralsight.Heck_Toppings.Heckful_RegularToppings;
import com.pluralsight.Heckful_Order.Heck_Order;
import com.pluralsight.One_Heck_of_a_Sandwich_Package.Heckful_Sandwich;
import com.pluralsight.Sides.Chips;
import com.pluralsight.Sides.Drink;
import com.pluralsight.Your_Soulful_Receipts.ReceiptWriter;

import java.util.Scanner;

public class One_Heck_Of_A_UI {
    private static final Scanner scanner = new Scanner(System.in);

    public static void UI_Display() {
        boolean running = true;

        while (running) {
            System.out.println(ColorCodes.BRIGHT_YELLOW + ColorCodes.BOLD + "==== Welcome to One Heck Of A Sandwich 🥵 ====" + ColorCodes.RESET);
            System.out.println(ColorCodes.BRIGHT_GREEN + "1) New Order 🌚" + ColorCodes.RESET);
            System.out.println(ColorCodes.BRIGHT_RED + "0) Exit 🙋🏾‍♂️" + ColorCodes.RESET);
            System.out.print(ColorCodes.BRIGHT_CYAN + "Choose an option: " + ColorCodes.RESET);
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.println(CaseColors.ANSI_GREEN + "Starting new order. 😃" + CaseColors.ANSI_RESET);
                    startOrder();
                    break;
                case "0":
                    System.out.println(CaseColors.ANSI_RED + "Exiting application. 😭" + CaseColors.ANSI_RESET);
                    running = false;
                    break;
                default:
                    System.out.println(ColorCodes.BRIGHT_RED + "Invalid option. Try again. 👿" + ColorCodes.RESET);
            }
        }

        System.out.println(ColorCodes.BRIGHT_PURPLE + ColorCodes.BOLD + "Thank you for using One Heck Of A Sandwich! 🙇🏾" + ColorCodes.RESET +
                ColorCodes.BRIGHT_CYAN + ColorCodes.BOLD + " Have one Heck of a Day Now 😈" + ColorCodes.RESET);
    }

    private static void startOrder() {
        Heck_Order order = new Heck_Order();
        boolean ordering = true;

        while (ordering) {
            System.out.println(ColorCodes.BRIGHT_BLUE + ColorCodes.BOLD + "\n=== Order Menu 🐦‍🔥 ===" + ColorCodes.RESET);
            System.out.println(ColorCodes.YELLOW + "1) Add Sandwich 🥪" + ColorCodes.RESET);
            System.out.println(ColorCodes.CYAN + "2) Add Drink 🍹" + ColorCodes.RESET);
            System.out.println(ColorCodes.GREEN + "3) Add Chips 🥔🍠" + ColorCodes.RESET);
            System.out.println(ColorCodes.BRIGHT_GREEN + ColorCodes.BOLD + "4) Checkout ✅" + ColorCodes.RESET);
            System.out.println(ColorCodes.BRIGHT_RED + "0) Cancel Order 🪦" + ColorCodes.RESET);
            System.out.print(ColorCodes.BRIGHT_CYAN + "💬 Choose an option: " + ColorCodes.RESET);
            String option = scanner.nextLine();

            switch (option) {
                case "1":
                    System.out.println(CaseColors.ANSI_YELLOW + "Building sandwich 🥪🥪🥪" + CaseColors.ANSI_RESET);
                    order.addSandwich(buildSandwich());
                    break;
                case "2":
                    System.out.println(CaseColors.ANSI_BLUE + "Adding drink 🥛🥛🥛 " + CaseColors.ANSI_RESET);
                    order.addDrink(buildDrink());
                    break;
                case "3":
                    System.out.println(CaseColors.ANSI_GREEN + "Adding chips 🥔🍠🥔" + CaseColors.ANSI_RESET);
                    order.addChips(buildChips());
                    break;
                case "4":
                    System.out.println(CaseColors.ANSI_YELLOW + "Processing checkout ✔️✔️✔️" + CaseColors.ANSI_RESET);
                    System.out.println(ColorCodes.BRIGHT_WHITE + ColorCodes.BOLD + "\n" + order.generateReceipt() + ColorCodes.RESET);
                    System.out.print(ColorCodes.BRIGHT_YELLOW + ColorCodes.BOLD + "Confirm order? (y/n): 🤔" + ColorCodes.RESET);
                    if (scanner.nextLine().equalsIgnoreCase("y")) {
                        ReceiptWriter.saveReceipt(order);
                        System.out.println(ColorCodes.BRIGHT_GREEN + ColorCodes.BOLD + "Order confirmed and saved! 😉" + ColorCodes.RESET);
                        ordering = false;
                    }
                    break;
                case "0":
                    System.out.println(CaseColors.ANSI_RED + "Canceling order. 😒" + CaseColors.ANSI_RESET);
                    System.out.println(ColorCodes.BRIGHT_RED + "Order canceled. ❌" + ColorCodes.RESET);
                    ordering = false;
                    break;
                default:
                    System.out.println(ColorCodes.BRIGHT_RED + "Invalid choice. 🫥" + ColorCodes.RESET);
            }
        }
    }

    private static Heckful_Sandwich buildSandwich() {
        System.out.println(ColorCodes.BRIGHT_YELLOW + ColorCodes.BOLD + "\n===🏗️ Build Your Hellish Sandwich 😋===" + ColorCodes.RESET);

        System.out.println(ColorCodes.BRIGHT_WHITE + "Choose size: " + ColorCodes.GREEN + "1) 4\"  " + ColorCodes.BLUE + "2) 8\"  " + ColorCodes.PURPLE + "3) 12\"" + ColorCodes.RESET);
        SandwichSize size = switch (scanner.nextLine()) {
            case "1" -> {
                System.out.println(CaseColors.ANSI_GREEN + "🥪 Selected 4\" sandwich" + CaseColors.ANSI_RESET);
                yield SandwichSize.FOUR_INCH;
            }
            case "2" -> {
                System.out.println(CaseColors.ANSI_BLUE + "🥖 Selected 8\" sandwich" + CaseColors.ANSI_RESET);
                yield SandwichSize.EIGHT_INCH;
            }
            case "3" -> {
                System.out.println(CaseColors.ANSI_YELLOW + "🍞 Selected 12\" sandwich" + CaseColors.ANSI_RESET);
                yield SandwichSize.TWELVE_INCH;
            }
            default -> {
                System.out.println(CaseColors.ANSI_BLUE + "🥖 Defaulted to 8\" sandwich" + CaseColors.ANSI_RESET);
                yield SandwichSize.EIGHT_INCH;
            }
        };

        System.out.println(ColorCodes.BRIGHT_WHITE + "Choose bread: " + ColorCodes.YELLOW + "1) White  " + ColorCodes.RED + "2) Wheat  " + ColorCodes.GREEN + "3) Rye  " + ColorCodes.CYAN + "4) Wrap" + ColorCodes.RESET);
        BreadType bread = switch (scanner.nextLine()) {
            case "1" -> {
                System.out.println(CaseColors.ANSI_YELLOW + "🍞 Selected White bread" + CaseColors.ANSI_RESET);
                yield BreadType.WHITE;
            }
            case "2" -> {
                System.out.println(CaseColors.ANSI_RED + "🌾 Selected Wheat bread" + CaseColors.ANSI_RESET);
                yield BreadType.WHEAT;
            }
            case "3" -> {
                System.out.println(CaseColors.ANSI_GREEN + "🥖 Selected Rye bread" + CaseColors.ANSI_RESET);
                yield BreadType.RYE;
            }
            case "4" -> {
                System.out.println(CaseColors.ANSI_BLUE + "🌯 Selected Wrap" + CaseColors.ANSI_RESET);
                yield BreadType.WRAP;
            }
            default -> {
                System.out.println(CaseColors.ANSI_YELLOW + "🍞 Defaulted to White bread" + CaseColors.ANSI_RESET);
                yield BreadType.WHITE;
            }
        };

        System.out.print(ColorCodes.BRIGHT_CYAN + "Toasted 🍞🔥?  (y/n): " + ColorCodes.RESET);
        boolean toasted = scanner.nextLine().equalsIgnoreCase("y");

        Heckful_Sandwich sandwich = new Heckful_Sandwich(size, bread, toasted);

        // Add meats
        addToppings(sandwich, "meat", true);
        // Add cheeses
        addToppings(sandwich, "cheese", true);
        // Add regular toppings
        addToppings(sandwich, "regular", false);
        // Add sauces
        addToppings(sandwich, "sauce", false);

        System.out.println(ColorCodes.BRIGHT_GREEN + ColorCodes.BOLD + " Sandwich built successfully! 🎊" + ColorCodes.RESET);
        return sandwich;
    }

    private static void addToppings(Heckful_Sandwich sandwich, String type, boolean isPremium) {
        String[] options = switch (type) {
            case "meat" -> new String[]{"🥩 Steak", "🍖 Ham", "🍕 Salami", "🥩 Roast Beef", "🍗 Chicken", "🥓 Bacon"};
            case "cheese" -> new String[]{"🧀 American", "🧀 Provolone", "🧀 Cheddar", "🧀 Swiss"};
            case "regular" ->
                    new String[]{"🥬 Lettuce", "🌶️ Peppers", "🧅 Onions", "🍅 Tomatoes", "🌶️ Jalapeños", "🥒 Cucumbers", "🥒 Pickles", "🥑 Guacamole", "🍄 Mushrooms"};
            case "sauce" ->
                    new String[]{"🥪 Mayo", "🌭 Mustard", "🍅 Ketchup", "🥗 Ranch", "🧡 Thousand Islands", "🥗 Vinaigrette"};
            default -> new String[]{};
        };

        String typeColor = switch (type) {
            case "meat" -> ColorCodes.BRIGHT_RED;
            case "cheese" -> ColorCodes.BRIGHT_YELLOW;
            case "regular" -> ColorCodes.BRIGHT_GREEN;
            case "sauce" -> ColorCodes.BRIGHT_PURPLE;
            default -> ColorCodes.WHITE;
        };

        String premiumIndicator = isPremium ? ColorCodes.YELLOW + " (Premium)" : "";
        System.out.println(typeColor + ColorCodes.BOLD + "\nAdd " + type.toUpperCase() + premiumIndicator + "? " + ColorCodes.BRIGHT_WHITE + "(Enter number, " + ColorCodes.BRIGHT_RED + "0" + ColorCodes.BRIGHT_WHITE + " to stop)" + ColorCodes.RESET);

        for (int i = 0; i < options.length; i++) {
            System.out.println(ColorCodes.BRIGHT_CYAN + (i + 1) + ") " + ColorCodes.WHITE + options[i] + ColorCodes.RESET);
        }

        while (true) {
            System.out.print(ColorCodes.BRIGHT_CYAN + "Choice: " + ColorCodes.RESET);
            String input = scanner.nextLine();
            if (input.equals("0")) break;

            try {
                int idx = Integer.parseInt(input) - 1;
                if (idx >= 0 && idx < options.length) {
                    String toppingName = options[idx];
                    boolean isExtra = false;

                    if (isPremium) {
                        System.out.print(ColorCodes.BRIGHT_YELLOW + "Extra " + toppingName + "? (y/n): " + ColorCodes.RESET);
                        isExtra = scanner.nextLine().equalsIgnoreCase("y");
                        sandwich.addTopping(new Heckful_PremiumToppings(toppingName, isExtra));
                        System.out.println(ColorCodes.BRIGHT_GREEN + "✅ Added " + (isExtra ? "extra " : "") + toppingName + ColorCodes.RESET);
                    } else {
                        sandwich.addTopping(new Heckful_RegularToppings(toppingName, false));
                        System.out.println(ColorCodes.BRIGHT_GREEN + "✅ Added " + toppingName + ColorCodes.RESET);
                    }
                } else {
                    System.out.println(ColorCodes.BRIGHT_RED + "Invalid topping choice. 🤬" + ColorCodes.RESET);
                }
            } catch (NumberFormatException e) {
                System.out.println(ColorCodes.BRIGHT_RED + "Invalid input. 😵‍💫" + ColorCodes.RESET);
            }
        }
    }

    private static Drink buildDrink() {
        System.out.println(ColorCodes.BRIGHT_CYAN + ColorCodes.BOLD + "\n=== Add a Drink 🍾 ===" + ColorCodes.RESET);
        System.out.println(ColorCodes.BRIGHT_WHITE + "Choose Drink Size: " + ColorCodes.GREEN + "1) Small  🔸" + ColorCodes.YELLOW + "2) Medium  Ⓜ️" + ColorCodes.RED + "3) Large 🔷" + ColorCodes.RESET);
        DrinkSize size = switch (scanner.nextLine()) {
            case "1" -> {
                System.out.println(CaseColors.ANSI_GREEN + "🟢 Selected Small drink 🥤" + CaseColors.ANSI_RESET);
                yield DrinkSize.SMALL;
            }
            case "2" -> {
                System.out.println(CaseColors.ANSI_YELLOW + "🟡 Selected Medium drink 🧃" + CaseColors.ANSI_RESET);
                yield DrinkSize.MEDIUM;
            }
            case "3" -> {
                System.out.println(CaseColors.ANSI_RED + "🔴 Selected Large drink 🧋" + CaseColors.ANSI_RESET);
                yield DrinkSize.LARGE;
            }
            default -> {
                System.out.println(CaseColors.ANSI_GREEN + "🟢 Defaulted to Small drink 🥤" + CaseColors.ANSI_RESET);
                yield DrinkSize.SMALL;
            }
        };

        System.out.print(ColorCodes.BRIGHT_PURPLE + "Enter Drink Flavor or Type: " + ColorCodes.RESET);
        String flavor = scanner.nextLine();

        System.out.println(ColorCodes.BRIGHT_GREEN + "✅ Added " + size.toString().toLowerCase() + " " + flavor + " drink! 🍶" + ColorCodes.RESET);
        return new Drink(size, flavor);
    }

    private static Chips buildChips() {
        System.out.println(ColorCodes.BRIGHT_GREEN + ColorCodes.BOLD + "\n=== Add Chips 🛢️🥔===" + ColorCodes.RESET);
        System.out.print(ColorCodes.BRIGHT_YELLOW + "Enter Chips Flavor or Type: " + ColorCodes.RESET);
        String type = scanner.nextLine();
        System.out.println(ColorCodes.BRIGHT_GREEN + "✅ Added " + type + " chips!" + ColorCodes.RESET);
        return new Chips(type);
    }
}