package Java_OOP;

import java.util.HashMap;
import java.util.Map;

public class Shop {
    private final Category[] categories;
    private final Map < String, User > users;

    Shop() {
        this.categories = new Category[2];
        this.users = new HashMap<>();

        //Items

        Category categoryChem = new Category("Chemistry");
        Item[] chems = new Item [] {
                new Item("Chloride", 15, 10),
                new Item("Zinc", 10, 20),
                new Item("Mercury", 25, 53),
                new Item("Uranium", 97, 28)
        };
        for (Item chem: chems) {
            categoryChem.putInCategory(chem.getId(), chem);
        }

        Category categoryDev = new Category("Devices");
        Item[] devs = new Item [] {
                new Item("Oscilloscope", 777, 22),
                new Item("Meter", 952, 163),
                new Item("Scales", 256, 128),
                new Item("Glasses", 99, 256),
        };

        for (Item dev: devs) {
            categoryDev.putInCategory(dev.getId(), dev);
        }

        categories[0] = categoryChem;
        categories[1] = categoryDev;

        //Users
        users.put("Rockfeller", new User ("Rockfeller", "abcdefgh"));
        users.put("Ford", new User("Ford", "ford_is"));
        users.put("Putin", new User("Putin", "987677777"));
        users.put("Lenin", new User("Lenin", "123456789"));
    }

    void trade(){
        
        printShop();

        //Sell
        System.out.println("Sell:");
        this.saleItem("Lenin", 5, 5);
        this.saleItem("Putin", 4, 1);
        this.saleItem("Putin", 6, 2);
        this.saleItem("Rockfeller", 6, 1);
        this.saleItem("Lenin", 7, 4);
        this.saleItem("Putin", 13, 7);
        
        printShop();
    }

    void printShop() {
        System.out.println("Shop: ");
        for (Category category : this.categories) {
            System.out.println(category);
        }
        
    }

    void saleItem(String userName, int itemId, int count) {
        Item item = this.getItem(itemId);
        System.out.print(userName +
                        " bought an item = " + itemId +
                        " in quantity " + count + " pieces. "
                );
        if (item == null) {
            System.out.println("The item is missed in a shop");
        } else if (item.getCount() < count) {
            System.out.println("Such quantity '" + item.getName() + "' is missed.");
        } else {
            this.users.get(userName).getBasket().putInBasket(itemId, count);
            item.saleItem(count);
            System.out.println("Bought " + count + " '" + item.getName() + "'.");
        }
    }

    Item getItem(int itemId) {
        for (Category category : this.categories) {
            Item item = category.getItem(itemId);
            if (item != null) {
                return item;
            }
        }
        return null;
    }
}