package com.pluralsight;

public class Transactions {
    public String date;
    public String time;
    public String description;
    public String vendor;
    public double amount;

    public Transactions(String date, String time, String description, String vendor, double amount) {
        this.date = date;
        this.time = time;
        this.description = description;
        this.vendor = vendor;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return date + " " + time + " | " + description + " | " + vendor + " | " + amount;
    }
}

