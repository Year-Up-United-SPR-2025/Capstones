# About One Heck of-a Sandwich Shop 😈🥪
This project is developing a point of sale (POS) application for One Heck of a Sandwich Shop, a custom sandwich shop, to streamline and automate the ordering process. 
It will leverage object-oriented programming principles by organizing the system into well-structured classes and interfaces that represent sandwiches, sides, orders, and more. 
The development starts with a class flowchart to guide the architecture, which will be updated and maintained in the project repository as the application evolves.

# Roadmap 🚧🥪
1. I started by thoroughly reviewing the project documentation to determine which classes would be needed for the application.
2. Then, I created a flowchart using Draw.io to visualize how the system components interact. 
Although the diagram appears a bit chaotic, I used color-coded arrows to clearly indicate which classes and code belong to each package, helping me understand how everything works together.
3. I created the necessary classes by following the structure outlined in my diagram and then organized them into separate packages. This approach helps keep the codebase clean, modular, and easier to manage as the project grows.
4. I added the required enum types in the Sandwich_Enums package to standardize and manage the fixed values referenced across my other classes:
* In Heck_Bread_Types I created the four Variables WHITE, WHEAT, RYE, and WRAP
* In Heck_Drink_Sizes I created the Variables SMALL with the price being 2.00, MEDIUM with the price being 2.50 and Large the price being 3.00.
* In Heck_Toppings_Type I have the variables REGULAR, MEAT, and CHEESE.
* In Heck_Drink_Sizes, I defined the variables SMALL, MEDIUM, and LARGE, each associated with their respective prices:
SMALL is priced at 2.00
MEDIUM at 2.50
LARGE at 3.00
* In Heck_Signature class this is the extra and has the Variables BLT, and PHILLY_CHEESESTEAK.
I also provided a constructor that accepts the following parameters: double basePrice, double meatPrice, double extraMeatPrice, double cheesePrice, and double extraCheesePrice, along with getter methods for each of these fields.

5. Went into my Heck_Toppings class and created the variables String name, Heck_Toppings_Type type, and a boolean isExtra

# FlowChart 📊🥪
![One Heck of a Board.jpg](UML%27s/One%20Heck%20of%20a%20Board.jpg)