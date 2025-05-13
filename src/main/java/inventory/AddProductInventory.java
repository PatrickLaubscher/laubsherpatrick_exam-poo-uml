package inventory;


import product.Product;

public class AddProductInventory {

    private final InventoryList inventoryList;

    public AddProductInventory() {
        this.inventoryList = InventoryList.getInstance();
    }

    public void addProduct(Product product) {
        inventoryList.getInventoryList().add(product.getDescription());
    }
    
}
