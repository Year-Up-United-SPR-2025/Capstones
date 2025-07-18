package com.pluralsight.Loaf_Recipts;

import com.pluralsight.Loaf_Order.Loaf_Order;

import java.io.FileWriter;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.io.File;
import java.time.LocalDateTime;


public class Loaf_Receipt {
    public static void saveReceipt(Loaf_Order order) {
        try {
            File folder = new File("Loaf_Directory");
            if (!folder.exists()) folder.mkdir();

            String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd-hhmmssa"));
            String filename = "Loaf_Directory/" + timestamp + ".txt";

            FileWriter writer = new FileWriter(filename);
            writer.write(order.generateReceipt());
            writer.close();

            System.out.println("Receipt saved to: " + filename);
        } catch (IOException e) {
            System.out.println("Failed to write receipt: " + e.getMessage());
        }
    }
}


