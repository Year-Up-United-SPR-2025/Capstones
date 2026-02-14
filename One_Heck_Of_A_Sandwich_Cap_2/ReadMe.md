# About One Heck Of-A Sandwich Shop 😈🥪
This project is developing a point of sale (POS) application for One Heck of a Sandwich Shop, a custom sandwich shop, to streamline and automate the ordering process. 
It will leverage object-oriented programming principles by organizing the system into well-structured classes and interfaces that represent sandwiches, sides, orders, and more. 
The development starts with a class flowchart to guide the architecture, which will be updated and maintained in the project repository as the application evolves.

# Roadmap 🚧🥪
1. Look through the documentation and create a Flowchart in Draw.io with color-coded packages and arrows to visualize the structure components of the project I am making.

Package Structure
---
2. Created A package named `Heck_Emuns`. This package is using emuns a Java type that keeps variables defined as constants throughout the project
effectively leaving them in their final states. This package contains the Bread Types we serve at the shop, The drink sizes and the size of the sandwiches 
people can buy:
* `BreadType` WHITE, WHEAT, RYE, WRAP, ITALIAN_HERB_AND_CHEESE
* `DrinkSize` SMALL, MEDIUM, LARGE
* `SandwichSize` FOUR_INCH, EIGHT_INCH, TWELVE_INCH

Side Items
---
3. Created a package named `Sides` this package contains two classes:
* `Chips` Has Fixed price of $1.50 with a type description
* `Drink` Has Sized bases pricing with flavor options

Toppings System
---
3. Created a package named `Heck_Toppings`. This package contains three classes:
* `Heckful_Toppings` An Abstract bases class with a `getPrice()` method 
* `Heckful_RegularToppings` Free toppings (returns $0.00)
* `Heckful_PremiumToppings` Paid toppings with size-based pricing

Signature Sandwich
---
3. Created a package named `Heck_Signatures` this package contains the different signature sandwiches my shop contains and the base class for sandwiches:
* `Hecks_Signature` Base class for predefined sandwiches
* `BLT_O_Heck` An eight-inch toasted white with bacon, cheddar, lettuce, tomatoes, ranch
* `Heck_O_Alot_Of_PhillyCheeseSteak` An eight inch toasted white with steak, American cheese, peppers, mayo
* `TheCluckinChicken` A twelve-inch Wheat bread with chicken, bacon, ranch
* `HeckinItialianSub` An eight-inch sub with Salami, Pepperoni, Provolone, Lettuce, Tomato and Oil & Vinegar.

Core Packages and Classes 
---
4. Created my core packages which are:
* `One_Heck_of_a_Sandwich_Package` this contains the `Heckful_Sandwich` class that keeps track of the customizable sandwich with size, bread, toppings, and pricing calculation.
* `Heckful_Order` this package contains `Heck_Order` this class keeps track of order management with ArrayLists for sandwiches, drinks, chips; auto-timestamped with total pricing
* `Your_Soulful_Receipts` this package contains `HeckinReceiptWriter` this class can create a directory for the receipts and saves the receipts as timestamped text files. Also, if the directory already exists it will just put the receipt in the directory instead of making a new one. 

User Interface
---
5. Created the user interface package `UI_OF_THE_DANGED` this package contains:
* `Heckin_Launcher` this class uses a Colorful CLI with emoji-enhanced menus for ordering, customization, and checkout. Also contains a `Thread.sleep()` method for smoother menu transitions.
* `CaseColors and ColorCodes` both of these classes make my project colorful in the terminal.

Main or Entry Point
---
6. Created my entry point class named `Heckin_Main` this runs my application using the `Heckin_Launcher.UI_Display()` to launch the application.

# FlowChart & File Structure 📊🥪
![One Heck of A FlowChartV4.jpg](UML%27s/v4%20FlowChart/One%20Heck%20of%20A%20FlowChartV4.jpg)

This is the flowchart I created to ensure I do not get lost in this project. I also have a previous version here to compare with the three: 

V1: https://github.com/Year-Up-United-SPR-2025/Capstones/blob/main/One_Heck_Of_A_Sandwich_Cap_2/UML's/V1FlowChart/One%20Heck%20of%20a%20Board%20V1.jpg

V2: https://github.com/Year-Up-United-SPR-2025/Capstones/blob/main/One_Heck_Of_A_Sandwich_Cap_2/UML's/V2FlowChart/One%20Heck%20of%20A%20FlowChart%20V2.jpg

V3: https://github.com/Year-Up-United-SPR-2025/Capstones/blob/main/One_Heck_Of_A_Sandwich_Cap_2/UML's/V3FlowChart/One%20Heck%20of%20A%20FlowChart%20V3.jpg

Right here is where you can see my file structure as well to get an idea of how the flowchart and this fit together:
[One_Heck_of_A_File_Structure.txt](One_Heck_of_A_File_Structure.txt)

# Screenshots 🥪📸

Welcome Screen
---
![HomeScreen.png](Screenshots/HomeScreen.png)

This is the start screen, and you can select `1` to start a new order or `2` to the exit the program.

Order Menu
---
![OrderMenu.png](Screenshots/OrderMenu.png)

Once you press `1` you see the text "Starting new order." Then see the `Order Menu` which shows the following options:
* `1) Add Sandwich 🥪`  this allows you to create like to add to your order
* `2) Add Drink 🍹` allows you to add a drink to your order
* `3) Add Signature Sandwich 📜` lets you add one of four signature sandwiches to your order
* `4) Add Chips 🥔🍠` allows you to add any chips to your order
* `5) Checkout ✅` once you are done with your order you can check out
* `0) Cancel Order 🪦` if you don't want to have any of your order you can cancel it using this


# Video Demo of Code 🥪📽️

[![Screenshot 2025-05-25 095046](https://github.com/user-attachments/assets/e7863657-f24f-434a-81d9-1c0b1f32f6f1)](https://youtu.be/Ia9SrZF1u5Y)

Click the image above to watch a video walkthrough of how the code works in action.
I’m really proud of this project and put a lot of effort into every detail—from the logic and structure of the code to thoughtful variable/class naming and clean, color-coded formatting.

# Interesting Piece of Code 🥪👀
![Capstone 2 IC.png](Screenshots/Capstone%202%20IC.png)

This part of the code was especially interesting to me because it checks if the receipts directory exists and creates it if it doesn't. 
If the directory is already there, the code simply proceeds to generate and save the receipt. I found this fun and rewarding to figure out, especially because I’ve seen similar patterns in other people's code before. 
I challenged myself to implement it in my project to learn how to write more reliable and polished Java code.

# References 🥪🔍
https://github.com/Year-Up-United-SPR-2025/Capstones/blob/main/One_Heck_Of_A_Sandwich_Cap_2/resources/resorces.txt

This project wouldn't have been possible without the help of these references.

# Web Edition 🖥️🥪
https://jordan721.github.io/Development-Showcase/Professional_Projects/One_Heck_Of_A_Sandwich_Web_Edition/index.html

