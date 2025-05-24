package com.pluralsight.Heck_Recepit;

import com.pluralsight.Heckful_Order.Heck_Order;

import java.io.FileWriter;
import java.io.IOException;
import java.time.format.DateTimeFormatter;

public class Heckful_Recepits {
    public static void saveReceipt(Heck_Order order) {
        String timestamp = order.getTimestamp().format(DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss"));
        String filename = "One_Heck_of_A_Receipts " + timestamp + " .txt";

        try (FileWriter writer = new FileWriter("receipts/" + filename)) {
            writer.write(order.generateReceipt());
            System.out.println("Receipt saved to receipts/" + filename);
        } catch (IOException e) {
            System.out.println("Failed to save receipt: " + e.getMessage());
        }
    }
}
