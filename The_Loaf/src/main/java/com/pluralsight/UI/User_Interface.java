package com.pluralsight.UI;

import com.pluralsight.Loaf_Emuns.BreadType;
import com.pluralsight.Loaf_Emuns.DrinkSize;
import com.pluralsight.Loaf_Emuns.SandwichSize;
import com.pluralsight.Loaf_Order.Loaf_Order;
import com.pluralsight.Loaf_Package.Loaf;
import com.pluralsight.Loaf_Recipts.Loaf_Receipt;
import com.pluralsight.Loaf_Sig.BLT;
import com.pluralsight.Loaf_Sig.Italian_Sub;
import com.pluralsight.Loaf_Sig.PhillyCheese;
import com.pluralsight.Loaf_Sig.Vegan;
import com.pluralsight.Loaf_Toppings.Loaf_RegularToppings;
import com.pluralsight.Sides.Chips;
import com.pluralsight.Sides.Drink;


import java.util.Scanner;

public class User_Interface {
    private static final Scanner scanner = new Scanner(System.in);
    private static final double SURCHARGE_AMOUNT = 0.50;

    // Helper method to add sleep delays
    private static void sleep(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static void UI_Display() {
        boolean running = true;

        while (running) {
            System.out.println(ColorCodes.BRIGHT_YELLOW + ColorCodes.BOLD + "==== 🫂 Welcome to The Loaf 🥵 ====" + ColorCodes.RESET);
            sleep(200);
            System.out.println(ColorCodes.BRIGHT_GREEN + "1) New Order 🌚" + ColorCodes.RESET);
            System.out.println(ColorCodes.BRIGHT_RED + "0) Exit 🙋🏾‍♂️" + ColorCodes.RESET);
            System.out.print(ColorCodes.BRIGHT_CYAN + "Choose an option: " + ColorCodes.RESET);
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.println(CaseColors.ANSI_GREEN + "Starting new order. 😃" + CaseColors.ANSI_RESET);
                    sleep(400);
                    startOrder();
                    break;
                case "0":
                    System.out.println(CaseColors.ANSI_RED + "Exiting application. 😭" + CaseColors.ANSI_RESET);
                    sleep(500);
                    running = false;
                    break;
                default:
                    System.out.println(ColorCodes.BRIGHT_RED + "Invalid option. Try again. 👿" + ColorCodes.RESET);
                    sleep(400);
            }
        }

        System.out.println(ColorCodes.BRIGHT_PURPLE + ColorCodes.BOLD + "Thank you for using The Loaf! 🙇🏾" + ColorCodes.RESET +
                ColorCodes.BRIGHT_CYAN + ColorCodes.BOLD + " Have one Loaf of a Day Now " + ColorCodes.RESET);
        sleep(700);
    }

    private static void startOrder() {
        Loaf_Order order = new Loaf_Order();
        boolean ordering = true;

        while (ordering) {
            System.out.println(ColorCodes.BRIGHT_BLUE + ColorCodes.BOLD + "\n=== Order Menu 🐦‍🔥 ===" + ColorCodes.RESET);
            sleep(150);
            System.out.println(ColorCodes.YELLOW + "1) Add Sandwich 🥪" + ColorCodes.RESET);
            System.out.println(ColorCodes.CYAN + "2) Add Drink 🍹" + ColorCodes.RESET);
            System.out.println(ColorCodes.PURPLE + "3) Add Signature Sandwich 📜" + ColorCodes.RESET);
            System.out.println(ColorCodes.GREEN + "4) Add Chips 🥔🍠" + ColorCodes.RESET);
            System.out.println(ColorCodes.BRIGHT_GREEN + ColorCodes.BOLD + "5) Checkout ✅" + ColorCodes.RESET);
            System.out.println(ColorCodes.BRIGHT_RED + "0) Cancel Order 🪦" + ColorCodes.RESET);
            System.out.print(ColorCodes.BRIGHT_CYAN + "💬 Choose an Option: " + ColorCodes.RESET);
            String option = scanner.nextLine();

            switch (option) {
                case "1":
                    System.out.println(CaseColors.ANSI_YELLOW + "Going to Building Sandwich 🥪🥪🥪" + CaseColors.ANSI_RESET);
                    sleep(500);
                    order.addSandwich(buildSandwich());
                    break;
                case "2":
                    System.out.println(CaseColors.ANSI_BLUE + "Going to Adding Drink 🥛🥛🥛 " + CaseColors.ANSI_RESET);
                    sleep(400);
                    order.addDrink(buildDrink());
                    break;
                case "3":
                    Loaf sig = chooseSignature();
                    if (sig != null) {
                        order.addSandwich(sig);
                        System.out.println(ColorCodes.BRIGHT_GREEN + "Added: " + sig.getName() + ColorCodes.RESET);
                    }
                    break;
                case "4":
                    System.out.println(CaseColors.ANSI_GREEN + "Adding Chips 🥔🍠🥔" + CaseColors.ANSI_RESET);
                    sleep(400);
                    order.addChips(buildChips());
                    break;
                case "5":
                    System.out.println(CaseColors.ANSI_YELLOW + "Processing checkout ✔️✔️✔️" + CaseColors.ANSI_RESET);
                    sleep(600);
                    System.out.println(ColorCodes.BRIGHT_WHITE + ColorCodes.BOLD + "\n" + order.generateReceipt() + ColorCodes.RESET);
                    sleep(250);
                    System.out.print(ColorCodes.BRIGHT_YELLOW + ColorCodes.BOLD + "Confirm order? (y/n): 🤔" + ColorCodes.RESET);
                    if (scanner.nextLine().equalsIgnoreCase("y")) {
                        System.out.println(ColorCodes.BRIGHT_CYAN + "Saving your order 💾" + ColorCodes.RESET);
                        sleep(700);
                        Loaf_Receipt.saveReceipt(order);
                        System.out.println(ColorCodes.BRIGHT_GREEN + ColorCodes.BOLD + "Order confirmed and saved! 😉" + ColorCodes.RESET);
                        sleep(500);
                        ordering = false;
                    }
                    break;
                case "0":
                    System.out.println(CaseColors.ANSI_RED + "Canceling order. 😒" + CaseColors.ANSI_RESET);
                    sleep(400);
                    System.out.println(ColorCodes.BRIGHT_RED + "Order canceled. ❌" + ColorCodes.RESET);
                    sleep(400);
                    ordering = false;
                    break;
                default:
                    System.out.println(ColorCodes.BRIGHT_RED + "Invalid choice. 🫥" + ColorCodes.RESET);
                    sleep(300);
            }
        }
    }

    private static Loaf buildSandwich() {
        System.out.println(ColorCodes.BRIGHT_YELLOW + ColorCodes.BOLD + "\n===🏗️ Build Your Loaf 😋===" + ColorCodes.RESET);
        sleep(350);

        System.out.println(ColorCodes.BRIGHT_WHITE + "Choose size: " + ColorCodes.GREEN + "1) 4\" 📏  " + ColorCodes.BLUE + "2) 8\" 📏 " + ColorCodes.PURPLE + "3) 12\" 📏" + ColorCodes.RESET);
        SandwichSize size = switch (scanner.nextLine()) {
            case "1" -> {
                System.out.println(CaseColors.ANSI_GREEN + "🥪 Selected 4\" sandwich" + CaseColors.ANSI_RESET);
                sleep(300);
                yield SandwichSize.FOUR_INCH;
            }
            case "2" -> {
                System.out.println(CaseColors.ANSI_BLUE + "🥖 Selected 8\" sandwich" + CaseColors.ANSI_RESET);
                sleep(300);
                yield SandwichSize.EIGHT_INCH;
            }
            case "3" -> {
                System.out.println(CaseColors.ANSI_YELLOW + "🍞 Selected 12\" sandwich" + CaseColors.ANSI_RESET);
                sleep(300);
                yield SandwichSize.TWELVE_INCH;
            }
            default -> {
                System.out.println(CaseColors.ANSI_BLUE + "🥖 Defaulted to 8\" sandwich" + CaseColors.ANSI_RESET);
                sleep(300);
                yield SandwichSize.EIGHT_INCH;
            }
        };

        System.out.println(ColorCodes.ANTIQUE_WHITE + "Choose bread: " + ColorCodes.YELLOW + "1) White  " + ColorCodes.RED + "2) Wheat  " + ColorCodes.GREEN + "3) Rye  " + ColorCodes.CYAN + "4) Wrap" + ColorCodes.LIME_GREEN_RGB + " 5) Italian" + ColorCodes.GHOST_WHITE + " Cheese" + ColorCodes.RED + " and Herbs" + ColorCodes.RESET);
        BreadType bread = switch (scanner.nextLine()) {
            case "1" -> {
                System.out.println(CaseColors.ANSI_YELLOW + "🍞 Selected White bread" + CaseColors.ANSI_RESET);
                sleep(300);
                yield BreadType.WHITE;
            }
            case "2" -> {
                System.out.println(CaseColors.ANSI_RED + "🌾 Selected Wheat Bread" + CaseColors.ANSI_RESET);
                sleep(300);
                yield BreadType.WHEAT;
            }
            case "3" -> {
                System.out.println(CaseColors.ANSI_GREEN + "🥖 Selected Rye Bread" + CaseColors.ANSI_RESET);
                sleep(300);
                yield BreadType.RYE;
            }
            case "4" -> {
                System.out.println(CaseColors.ANSI_BLUE + "🌯 Selected Wrap" + CaseColors.ANSI_RESET);
                sleep(300);
                yield BreadType.WRAP;
            }
            case "5" -> {
                System.out.println(ColorCodes.LIME_GREEN_RGB + "Selected" + ColorCodes.SNOW_RGB + " Italian Cheese" + ColorCodes.BRIGHT_RED + " and Herb" + " 💚🤍❤️" + CaseColors.ANSI_RESET);
                sleep(300);
                yield BreadType.ITALIAN_HERB_AND_CHEESE;
            }
            default -> {
                System.out.println(CaseColors.ANSI_YELLOW + "🍞 Defaulted to White Bread" + CaseColors.ANSI_RESET);
                sleep(300);
                yield BreadType.WHITE;
            }
        };

        System.out.print(ColorCodes.BRIGHT_CYAN + "Toasted 🍞🔥?  (y/n): " + ColorCodes.RESET);
        boolean toasted = scanner.nextLine().equalsIgnoreCase("y");
        if (toasted) {
            System.out.println(ColorCodes.BRIGHT_YELLOW + "🔥 Toasting your bread 🍞" + ColorCodes.RESET);
            sleep(500);
        }

        Loaf sandwich = new Loaf(size, bread, toasted);

        // Initialize topping counter
        ToppingCounter counter = new ToppingCounter(sandwich);

        // Add meats
        addToppings(sandwich, "meat", true, counter);
        // Add cheeses
        addToppings(sandwich, "cheese", true, counter);
        // Add regular toppings
        addToppings(sandwich, "regular", false, counter);
        // Add sauces
        addToppings(sandwich, "sauce", false, counter);

        System.out.println(ColorCodes.BRIGHT_GREEN + ColorCodes.BOLD + " Sandwich built successfully! 🎊" + ColorCodes.RESET);
        sleep(500);
        return sandwich;
    }

    // Class to track topping counts and apply actual charges
    private static class ToppingCounter {
        private int totalToppings = 0;
        private int extraToppings = 0;
        private int totalSauces = 0;
        private int extraSauces = 0;
        private int chargesMade = 0;
        private Loaf sandwich;

        public ToppingCounter(Loaf sandwich) {
            this.sandwich = sandwich;
        }

        public void addTopping(boolean isExtra) {
            totalToppings++;
            if (isExtra) extraToppings++;
            checkForChargeApplication();
        }

        public void addSauce(boolean isPremium) {
            totalSauces++;
            if (isPremium) extraSauces++;
            checkForChargeApplication();
        }

        private void checkForChargeApplication() {
            boolean shouldCharge = false;
            String chargeReason = "";

            int combinedTotal = totalToppings + totalSauces;
            int combinedExtras = extraToppings + extraSauces;

            // Charge for every 3 total items (toppings + sauces)
            if (combinedTotal > 0 && combinedTotal % 3 == 0) {
                int expectedCharges = combinedTotal / 3;
                if (expectedCharges > chargesMade) {
                    shouldCharge = true;
                    chargeReason = "every 3 total toppings/sauces";
                }
            }

            // Charge for every 2 extras (extra toppings + premium sauces)
            if (combinedExtras > 0 && combinedExtras % 2 == 0) {
                int expectedExtraCharges = combinedExtras / 2;
                if (expectedExtraCharges > (chargesMade - (combinedTotal / 3))) {
                    shouldCharge = true;
                    chargeReason = "every 2 extras (toppings/premium sauces)";
                }
            }

            if (shouldCharge) {
                sleep(200);
                System.out.println(ColorCodes.BRIGHT_YELLOW + ColorCodes.BOLD +
                        "💰 Additional charge: $" + String.format("%.2f", SURCHARGE_AMOUNT) +
                        " Applied (" + chargeReason + ")! 💸" + ColorCodes.RESET);
                sandwich.addSurcharge(SURCHARGE_AMOUNT);
                chargesMade++;
                sleep(400);
            }
        }
    }


    private static void addToppings(Loaf sandwich, String type, boolean isPremium, ToppingCounter counter) {
        String[] options = switch (type) {
            case "meat" ->
                    new String[]{ColorCodes.RED + "🥩 Steak", ColorCodes.RED + "🍖 Ham", ColorCodes.RED + "🥪 Salami", ColorCodes.RED + "🥩 Roast Beef", ColorCodes.BROWN_RGB + "🍗 Chicken", ColorCodes.BRIGHT_RED + "🥓 Bacon"};
            case "cheese" ->
                    new String[]{ColorCodes.YELLOW + "🧀 American", ColorCodes.IVORY + "🧀 Provolone", ColorCodes.YELLOW + "🧀 Cheddar", ColorCodes.GHOST_WHITE + "🧀 Swiss"};
            case "regular" ->
                    new String[]{ColorCodes.FOREST_GREEN + "🥬 Lettuce", ColorCodes.BRIGHT_RED + "🌶️ Peppers", ColorCodes.YELLOW + "🧅 Onions", ColorCodes.RED + "🍅 Tomatoes", ColorCodes.LIME_GREEN + "🌶️ Jalapeños", ColorCodes.GREEN + "🥒 Cucumbers", ColorCodes.SEA_GREEN + "🥒 Pickles", ColorCodes.GREEN + "🥑 Guacamole", ColorCodes.GHOST_WHITE + "🍄 Mushrooms"};
            case "sauce" ->
                    new String[]{ColorCodes.GHOST_WHITE + "🥪 Mayo", ColorCodes.YELLOW + "💛 Honey Mustard", ColorCodes.BRIGHT_RED + "🍅 Ketchup", ColorCodes.ANTIQUE_WHITE + "🥗 Ranch", ColorCodes.ORANGE + "🧡 Thousand Islands", ColorCodes.CORAL + "🥗 Vinaigrette"};
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
        System.out.println(typeColor + ColorCodes.BOLD + "\nAdd " + type.toUpperCase() + premiumIndicator + "? " + ColorCodes.BRIGHT_WHITE + "(Enter the number, " + ColorCodes.BRIGHT_RED + "0" + ColorCodes.BRIGHT_WHITE + " to stop)" + ColorCodes.RESET);
        sleep(200);

        for (int i = 0; i < options.length; i++) {
            System.out.println(ColorCodes.BRIGHT_CYAN + (i + 1) + ") " + ColorCodes.WHITE + options[i] + ColorCodes.RESET);
            sleep(75);
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
                        sandwich.addTopping(new Loaf_RegularToppings(toppingName, isExtra));
                        System.out.println(ColorCodes.BRIGHT_GREEN + "✅ Added " + (isExtra ? "extra " : "") + toppingName + ColorCodes.RESET);
                        sleep(250);
                    } else {
                        sandwich.addTopping(new Loaf_RegularToppings(toppingName, false));
                        System.out.println(ColorCodes.BRIGHT_GREEN + "✅ Added " + toppingName + ColorCodes.RESET);
                        sleep(200);
                    }

                    // Update counter and apply actual charges
                    counter.addTopping(isExtra);

                } else {
                    System.out.println(ColorCodes.BRIGHT_RED + "Invalid topping choice. 🤬" + ColorCodes.RESET);
                    sleep(250);
                }
            } catch (NumberFormatException e) {
                System.out.println(ColorCodes.BRIGHT_RED + "Invalid input. 😵‍💫" + ColorCodes.RESET);
                sleep(250);
            }
        }
    }

    private static Drink buildDrink() {
        System.out.println(ColorCodes.BRIGHT_CYAN + ColorCodes.BOLD + "\n===➕ Add a Drink 🍾 ===" + ColorCodes.RESET);
        sleep(250);
        System.out.println(ColorCodes.BRIGHT_WHITE + "Choose Drink Size: " + ColorCodes.GREEN + "1) Small 🥤  " + ColorCodes.YELLOW + "2) Medium 🧃  " + ColorCodes.RED + "3) Large 🧋" + ColorCodes.RESET + ColorCodes.GOLD + "4) Extreme" + ColorCodes.RESET);
        DrinkSize size = switch (scanner.nextLine()) {
            case "1" -> {
                System.out.println(CaseColors.ANSI_GREEN + "Selected Small drink 🥤" + CaseColors.ANSI_RESET);
                sleep(300);
                yield DrinkSize.SMALL;
            }
            case "2" -> {
                System.out.println(CaseColors.ANSI_YELLOW + "Selected Medium drink 🧃" + CaseColors.ANSI_RESET);
                sleep(300);
                yield DrinkSize.MEDIUM;
            }
            case "3" -> {
                System.out.println(CaseColors.ANSI_RED + "Selected Large drink 🧋" + CaseColors.ANSI_RESET);
                sleep(300);
                yield DrinkSize.LARGE;
            }
            case  "4" -> {
                System.out.println(CaseColors.ANSI_RED + "Selected Extreme drink 🍾" + CaseColors.ANSI_RESET);
                sleep(300);
                yield DrinkSize.LARGE;
            }
            default -> {
                System.out.println(CaseColors.ANSI_GREEN + "Defaulted to Small drink 🥤" + CaseColors.ANSI_RESET);
                sleep(300);
                yield DrinkSize.SMALL;
            }
        };

        System.out.print(ColorCodes.BRIGHT_PURPLE + "Enter Drink Flavor or Type: " + ColorCodes.RESET);
        String flavor = scanner.nextLine();

        System.out.println(ColorCodes.BRIGHT_GREEN + "✅ Added " + size.toString().toLowerCase() + " " + flavor + " Drink! 🍶" + ColorCodes.RESET);
        sleep(350);
        return new Drink(size, flavor);
    }

    private static Chips buildChips() {
        System.out.println(ColorCodes.BRIGHT_GREEN + ColorCodes.BOLD + "\n===➕ Add Chips 🛢️🥔===" + ColorCodes.RESET);
        sleep(250);
        System.out.print(ColorCodes.BRIGHT_YELLOW + "Enter Chips Flavor or Type: " + ColorCodes.RESET);
        String type = scanner.nextLine();
        System.out.println(ColorCodes.BRIGHT_GREEN + "✅ Added " + type + " chips!" + ColorCodes.RESET);
        sleep(300);
        return new Chips(type);
    }

    private static Loaf chooseSignature() {
        System.out.println(ColorCodes.BRIGHT_WHITE + "\nChoose a signature sandwich:" + ColorCodes.RESET);
        System.out.println(ColorCodes.BLUE + "1) 🥓 BLT" + ColorCodes.RESET);
        System.out.println(ColorCodes.RED + "2) 🧀  Philly Cheese Steak" + ColorCodes.RESET);
        System.out.println(ColorCodes.BRIGHT_PURPLE + "3) 🍅 Italian" + ColorCodes.RESET);
        System.out.println(ColorCodes.LAVENDER + "4) Vegan" + ColorCodes.RESET);
        System.out.print("Your choice: ");
        String input = scanner.nextLine();

        return switch (input) {
            case "1" -> new BLT();
            case "2" -> new PhillyCheese();
            case "3" -> new Italian_Sub();
            case "4" -> new Vegan();
            default -> {
                System.out.println(ColorCodes.BRIGHT_RED + "Invalid choice. Returning to menu." + ColorCodes.RESET);
                yield null;
            }
        };
    }
}
