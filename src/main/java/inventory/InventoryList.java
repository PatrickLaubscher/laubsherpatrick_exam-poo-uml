package inventory;

import java.util.ArrayList;
import java.util.List;

public class InventoryList {

    private static InventoryList instance;
    private final List<String> inventoryList;

    private InventoryList() {
        this.inventoryList = new ArrayList<>();
    }

    public static InventoryList getInstance() {
        if (instance == null) {
            instance = new InventoryList();
        }
        return instance;
    }

    public List<String> getInventoryList() {
        return this.inventoryList;
    }
    
}
