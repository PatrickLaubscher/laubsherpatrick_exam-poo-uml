package inventory;

import java.util.ArrayList;
import java.util.List;

import product.ProductBase;

public class InventoryList {

    private static InventoryList instance;
    private final List<ProductBase> inventoryList;

    private InventoryList() {
        this.inventoryList = new ArrayList<>();
    }

    public static InventoryList getInstance() {
        if (instance == null) {
            instance = new InventoryList();
        }
        return instance;
    }

    // Renvoie la liste de l'inventaire sous forme de String
    public List<ProductBase> getInventoryList() {
        return this.inventoryList;
    }
    
}
