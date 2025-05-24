package com.pluralsight.Your_Soulful_Receipts;

import com.pluralsight.Heckful_Order.Heck_Order;

import java.io.FileWriter;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.io.File;
import java.time.LocalDateTime;


public class ReceiptWriter {
    public static void saveReceipt(Heck_Order order) {
        try {
            File folder = new File("receipts");
            if (!folder.exists()) folder.mkdir();

            String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd-hhmmssa"));
            String filename = "receipts/" + timestamp + ".txt";

            FileWriter writer = new FileWriter(filename);
            writer.write(order.generateReceipt());
            writer.close();

            System.out.println("Receipt saved to: " + filename);
        } catch (IOException e) {
            System.out.println("Failed to write receipt: " + e.getMessage());
        }
    }
}


