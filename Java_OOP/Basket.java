package Java_OOP;

import java.util.HashMap;
import java.util.Map;

class Basket {
    private static int counterId = 0;
    private final int id;
    private final Map<Integer, Integer> purchasedItems = new HashMap<>();

    Basket(){
        counterId++;
        this.id = counterId;
    }

    int getId() {
        return id;
    }

    Map<Integer, Integer> getItems() {
        return purchasedItems;
    }

    void putInBasket(int itemId, int count) {
        purchasedItems.put(itemId, count);
    }

    @Override
    public String toString() {
        return "Basket {" +
                "identif. = '" + id + "', " +
                "items bought = '" + purchasedItems + '\'' +
                '}';
    }
}