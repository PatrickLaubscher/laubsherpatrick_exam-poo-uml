package inventory;

public class RemoveProductFromInventory {
    
    private final InventoryList inventoryList;

    public RemoveProductFromInventory() {
        this.inventoryList = InventoryList.getInstance();
    }

    // Méthode pour supprimer un produit de l'inventaire
    public void RemoveOneProductFromInventory(String id) {
        inventoryList.getInventoryList().removeIf(product -> product.getId().equals(id));
 
    }

}
