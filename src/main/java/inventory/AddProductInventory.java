package inventory;


import product.Product;

public class AddProductInventory {

        public void addProduct(Product product) {
        InventoryList.getInstance().getInventoryList().add(product.getDescription());
    }
    
}
