package com.pluralsight;

import java.io.*;
import java.util.*;

public class Ledger {
    private List<Transactions> transactions = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public Ledger() {
        loadTransactionsFromCSV("transactions.csv");
    }

    //HomeScreen
    public void showHome() {
        while (true) {
            System.out.println("\n=== Home Menu ===");
            System.out.println("D) Deposits");
            System.out.println("P) Payments");
            System.out.println("R) Reports");
            System.out.println("H) Home (Reload)");
            System.out.println("E) Exit");
            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine().toUpperCase();

            if (choice.equals("D")) {
                showCreditTransactions();
            } else if (choice.equals("P")) {
                showDebitPayments();
            } else if (choice.equals("R")) {
                showReports();
            } else if (choice.equals("H")) {
                System.out.println("Already at Home.");
            } else if (choice.equals("E")) {
                Exit_Handler exitHandler = new Exit_Handler(scanner);
                exitHandler.waitForExit();
            } else {
                System.out.println("Invalid input.");
            }
        }
    }

    //Deposits Credit
    private void showCreditTransactions() {
        System.out.println("\n=== Deposits ===");
        for (Transactions t : transactions) {
            if (t.amount > 0) {
                System.out.println(t);
            }
        }
    }

    //Payments Debit
    private void showDebitPayments() {
        System.out.println("\n=== Payments ===");
        for (Transactions t : transactions) {
            if (t.amount < 0) {
                System.out.println(t);
            }
        }
    }

    //Show Reports
    private void showReports() {
        System.out.print("Enter vendor name to search: ");
        String vendor = scanner.nextLine().toLowerCase();
        System.out.println("\n=== Transactions Matching Vendor ===");
        for (Transactions t : transactions) {
            if (t.vendor.toLowerCase().contains(vendor)) {
                System.out.println(t);
            }
        }
    }

    //loading form transactions.csv
    private void loadTransactionsFromCSV(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\\|");
                if (parts.length == 5) {
                    String date = parts[0].trim();
                    String time = parts[1].trim();
                    String description = parts[2].trim();
                    String vendor = parts[3].trim();
                    double amount = Double.parseDouble(parts[4].trim());
                    transactions.add(new Transactions(date, time, description, vendor, amount));
                }
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
}
