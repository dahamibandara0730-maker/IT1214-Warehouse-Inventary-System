Project Name: Warehouse Inventory System

Purpose:

This program is a simple inventory management system. It allows you to:

1. Add items to the warehouse.
2. Remove items from the warehouse.
3. Update the quantity of items.
4. Search items by ID or by Name.
5.*View all items in the inventory.

It helps a warehouse manager keep track of items and their stock.





1. Item.java

   * Represents a single item in the warehouse.
   * Stores ID, Name, Quantity, and Price.
   * Has getters to read values and a setter to update quantity.
   * `toString()` prints the item in a readable format,

2. Inventory.java

   * Stores all items** using an "ArrayList<Item>".
   * Has methods to:

     * addItem() → add a new item
     * removeItem() → remove by ID
     * updateQuantity() → change quantity by ID
     * searchById() → find an item by ID
     * searchByName() → find an item by Name
     * displayAll() → show all items
   * Uses **simple for-loops** to check each item.

3. Warehouse.java

   * Main program with menu-driven interface.
   * Lets user choose an action: Add, Remove, Update, Search, Display, or Exit.
   * Uses Scanner to get input from the user.
   * Calls Inventory methods to perform tasks.



How to run the program:
Javac Warehouse.java
Java Warehouse


Sample output:







--- Warehouse Menu ---
1. Add Item
2. Remove Item
3. Update Quantity
4. Search Item
5. View All Items
6. Exit
