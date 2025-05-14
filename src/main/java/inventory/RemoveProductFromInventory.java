package inventory;

import product.ProductBase;

public class RemoveProductFromInventory {
    
    private final InventoryList inventoryList;

    public RemoveProductFromInventory() {
        this.inventoryList = InventoryList.getInstance();
    }

    // Méthode pour supprimer un produit de l'inventaire
    public String RemoveOneProductFromInventory(String id) {
        for (ProductBase product : inventoryList.getInventoryList()) {
            if (product.getId().equals(id)) {
                inventoryList.getInventoryList().remove(product);
            } else {
                System.err.println("Ce produit n'existe pas dans l'inventaire.");
            }
        }
        return null;
    }

}
