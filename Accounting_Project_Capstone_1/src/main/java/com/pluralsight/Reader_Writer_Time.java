package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class Reader_Writer_Time {

    private static final String FILE_NAME = "transactions.csv";

    // Save a deposit record
    public static void saveDeposit(String date, String description, String vendor, double amount) {
        // Get current time
        LocalTime now = LocalTime.now();
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh:mm a");
        String time = now.format(timeFormatter);

        // Format: date|time|description|vendor|amount
        String depositRecord = date + "|" + time + "|" + description + "|" + vendor + "|" + amount;

        try (FileWriter writer = new FileWriter(FILE_NAME, true)) {
            writer.write(depositRecord + "\n");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    // Read and display all deposit records
    public static void readDeposits() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;

            // Print header once
            System.out.println("Date       | Time     | Description       | Vendor       | Amount");
            System.out.println("---------------------------------------------------------------");

            while ((line = reader.readLine()) != null) {
                // Split the line by "|"
                String[] parts = line.split("\\|");
                if (parts.length == 5) {
                    // Print all parts in a single line
                    System.out.printf("%-10s | %-8s | %-16s | %-12s | $%s%n",
                            parts[0], parts[1], parts[2], parts[3], parts[4]);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
}