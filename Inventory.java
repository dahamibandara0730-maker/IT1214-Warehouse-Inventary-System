import java.util.ArrayList;

public class Inventory {
    private ArrayList<Item> items;

    public Inventory() {
        items = new ArrayList<>();
    }

    // Add item
    public void addItem(Item item) {
        items.add(item);
        System.out.println("Item added!");
    }

    // Remove item by ID
    public void removeItem(String id) {
        boolean found = false;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getId().equals(id)) {
                items.remove(i);
                System.out.println("Item removed!");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Item not found!");
        }
    }

    // Update quantity
    public void updateQuantity(String id, int qty) {
        boolean found = false;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getId().equals(id)) {
                items.get(i).setQuantity(qty);
                System.out.println("Quantity updated!");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Item not found!");
        }
    }

    // Search by ID
    public void searchById(String id) {
        boolean found = false;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getId().equals(id)) {
                System.out.println(items.get(i));
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Item not found!");
        }
    }

    // Search by Name
    public void searchByName(String name) {
        boolean found = false;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getName().equalsIgnoreCase(name)) {
                System.out.println(items.get(i));
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Item not found!");
        }
    }

    // Display all items
    public void displayAll() {
        if (items.isEmpty()) {
            System.out.println("Inventory is empty!");
            return;
        }
        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i));
        }
    }
}
