package Java_OOP;

import java.util.HashMap;
import java.util.Map;

class Category {
    private static int counterId = 0;
    private final int id;
    private final String name;
    private Map<Integer, Item> items = new HashMap<>();

    Category(String name){
        counterId++;
        this.id = counterId;
        this.name = name;
    }

    Category(String name, Map<Integer, Item> items){
        counterId++;
        this.id = counterId;
        this.name = name;
        this.items = items;
    }

    int getId() {
        return id;
    }

    String getName() {
        return name;
    }

    Map<Integer, Item> getItems() {
        return items;
    }

    Item getItem(int itemId) {
        return items.get(itemId);
    }

    void putInCategory(int itemId, Item item) {
        items.put(itemId, item);
    }

    void removeFromCategory(int itemId) {
        items.remove(itemId);
    }


    @Override
    public String toString() {
        StringBuilder message = new StringBuilder();
        String messageAboutCategory = "Category is {" +
                "identif = '" + id + "', " +
                "with name = '" + this.name + '\'' +
                "}\n";
        message.append(messageAboutCategory);
        for(Map.Entry<Integer, Item> item : this.items.entrySet()) {
            message.append(item.getValue());
            message.append("\n");
        }

        return message.toString();
    }

}