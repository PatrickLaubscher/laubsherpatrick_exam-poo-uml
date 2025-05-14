package inventory;

import product.ProductBase;

public class FindOneProductById {
    
    private final InventoryList inventoryList;

    public FindOneProductById() {
        this.inventoryList = InventoryList.getInstance();
    }

    // Renvoie le produit correspondant à l'id 
    public ProductBase findOneProductById(String id) {
        for (ProductBase product : inventoryList.getInventoryList()) {
            if (product.getId().equals(id)) {
                return product;
            }
        }
        return null;
    }

}
