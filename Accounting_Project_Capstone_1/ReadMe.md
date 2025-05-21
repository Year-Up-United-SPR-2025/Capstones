# About Accounting Program Capstone 1 🧮
In this project, I built a Java CLI application to track financial transactions for either business or personal use. The application stores all transactions in a file named transactions.csv, with each transaction saved as a single line containing important details: date, time, description, vendor, and amount.
I developed this project using IntelliJ, which provided robust features like real-time code suggestions, file management, and integrated terminal support, making development smoother and more efficient.

The application leverages several Java classes to perform its core functions:

* import java.time.LocalTime; and import java.time.format.DateTimeFormatter; were used to capture and format the time each transaction was recorded.

* import java.util.Scanner; enabled user interaction through the command-line interface.

* import java.io.BufferedReader;, import java.io.FileReader;, and import java.io.FileWriter; were essential for reading from and writing to the transactions.csv file.

* import java.io.IOException; helped handle file I/O exceptions.

Overall, this application reads from and writes to the transaction file to help users record, store, and review financial data efficiently through a clean, text-based interface.

# Roadmap 🚧
1. I looked through the documentation and Created the classes that I needed for my program to work:
* A Transaction Class contains a constructor, Setters and Getters and a overwrite method to save date, time, description, vendor, and amount.
* An Exit Handler to handel when the user is done with the program using the Scanner and to accomplish this.
* This class is responsible for handling all file and time-related operations for the ledger system. It performs the following functions:

Read from File: Reads and displays transaction data from the transactions.csv file directly to the terminal.

Write to File: Writes new transaction entries (deposits or payments) to the transactions.csv file.

Timestamp Entries: Automatically captures the current date and time when a new transaction is entered and includes it in the file.

* The Ledger class manages and displays financial transactions from a CSV file. It provides a home menu interface for viewing deposits, payments, and vendor-based reports. It reads transaction data from transactions.csv on initialization and filters entries based on user input.
* Finally, a Main class that contains that displays Entering a date, description, vendor, amount, greetings and a closing text when the code is done running.

# Screenshots 📸
![StartScreen.png](Screenshots/StartScreen.png)

This is that 1st thing you see when you run this app it displays the current time, asks you for the date (YYYY-MM-DD), 
Enter the Description (What is the item user purchased), Add the Vendor, and lastly Enter the Amount. Once the transaction is complete the message Transaction Added! will appear.

![StartScreen2.png](Screenshots/StartScreen2.png)

You could also add another transaction if you wanted to by pressing Y or y to ann another when Do you want to add another transaction? (y/n) shows up and then when you're done you could exit the app early by pressing Do you want to exit the app? (y/n)

![Ledger Screen List.png](Screenshots/Ledger%20Screen%20List.png)

Once you press N or n you will see the list of items previously in the ledger and the newer additions as well

After that you will see the home screen to show your options:

![HomeScreen.png](Screenshots/HomeScreen.png)


As shone here you can press D or d to get deposits:

![Deposits .png](Screenshots/Deposits%20.png)

Pressing p or P to get payments:

![Payments.png](Screenshots/Payments.png)

Using r or R you can pull up specific transactions:

![Reports.png](Screenshots/Reports.png)

Using h or H to make sure your on the home screen:

![HomeReload.png](Screenshots/HomeReload.png)

Finally, e or E to x or X to exit app:

![Close.png](Screenshots/Close.png)

# Interesting piece of Code
![carbon.png](Screenshots/carbon.png)

I thought that this was an interesting piece of code because thanks to this I was able to hardcode when time when the entry was made so that way you would not have to add it yourself.

# Special Thanks 
Thank you to one of my teammates who helped me find a good Readme creator called https://readme.so/ to help make this readme template, and using https://carbon.now.sh/ to create the screenshots above, and to my professor who caught little issues like my name conventions and little mistakes that I missed when making this project.