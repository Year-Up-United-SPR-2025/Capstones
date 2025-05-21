package com.pluralsight;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        startTransactionProcess(new Scanner(System.in));
    }

    public static void startTransactionProcess(Scanner scanner) {
        // Show current time once at the start
        LocalTime now = LocalTime.now();
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh:mm a");
        System.out.println("Current time: " + now.format(timeFormatter));

        boolean keepRunning = true;

        while (keepRunning) {
            System.out.println("\nEnter transaction details:");

            System.out.print("Enter the Date (YYYY-MM-DD): ");
            String date = scanner.nextLine();

            System.out.print("Enter the Description: ");
            String description = scanner.nextLine();

            System.out.print("Add the Vendor: ");
            String vendor = scanner.nextLine();

            System.out.print("Enter the Amount: ");
            double amount = scanner.nextDouble();
            scanner.nextLine();

            // Save to file (assuming the save method exists)
            Reader_Writer_Time.saveDeposit(date, description, vendor, amount);

            System.out.println("\nTransaction Added!");

            // Ask if user wants to add another transaction
            System.out.print("\nDo you want to add another transaction? (y/n): ");
            String answer = scanner.nextLine();

            if (!answer.equalsIgnoreCase("y")) {
                // Ask if user wants to exit the app
                System.out.print("\nDo you want to exit the app? (y/n): ");
                String exitAnswer = scanner.nextLine();

                if (exitAnswer.equalsIgnoreCase("y")) {
                    Exit_Handler exitHandler = new Exit_Handler(scanner);
                    exitHandler.waitForExit();
                } else {
                    // Show all transactions and go to home screen
                    Reader_Writer_Time.readDeposits();
                    Ledger ledger = new Ledger();
                    ledger.showHome();
                }

                // Stops the loop
                keepRunning = false;
            }
        }
    }
}
