package inventory;


import product.ProductBase;

public class AddProductInventory {

    private final InventoryList inventoryList;

    public AddProductInventory() {
        this.inventoryList = InventoryList.getInstance();
    }

    public void addProduct(ProductBase product) {
        inventoryList.getInventoryList().add(product);
    }
    
}
