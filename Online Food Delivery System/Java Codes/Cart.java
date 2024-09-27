package OnlineFoodDeliSys;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<FoodItem, Integer> items;

    public Cart() {
        items = new HashMap<>();
    }

    public void addItem(FoodItem foodItem, int quantity) {
        items.put(foodItem, items.getOrDefault(foodItem, 0) + quantity);
    }

    public void removeItem(FoodItem foodItem) {
        items.remove(foodItem);
    }

    public Map<FoodItem, Integer> getItems() {
        return items;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "items=" + items +
                '}';
    }
}