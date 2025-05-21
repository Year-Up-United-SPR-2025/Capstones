package com.pluralsight;

import java.util.Scanner;

public class Exit_Handler {
    private final char exitChar = 'x';
    private Scanner scanner;

    public Exit_Handler(Scanner scanner) {
        this.scanner = scanner;
    }

    public void waitForExit() {
        System.out.println("Press '" + exitChar + "' or 'X' to exit the app");
        while (true) {
            String exiting = scanner.nextLine();
            if (exiting.length() == 1) {
                char inputChar = exiting.charAt(0);
                if (inputChar == exitChar || inputChar == Character.toUpperCase(exitChar)) {
                    System.out.println("Closing App Now...........");
                    System.exit(0);
                } else {
                    System.out.println("Not acceptable, please try again.");
                }
            } else {
                System.out.println("Not acceptable, please try again.");
            }
        }
    }
}
