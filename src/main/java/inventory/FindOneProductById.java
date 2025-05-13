package inventory;

public class FindOneProductById {
    
    private final InventoryList inventoryList;

    public FindOneProductById() {
        this.inventoryList = InventoryList.getInstance();
    }

    // Renvoie le produit correspondant à l'id sous forme de String
    public String findOneProductById(String id) {
        for (String product : inventoryList.getInventoryList()) {
            if (product.contains(id)) {
                return product;
            }
        }
        return null;
    }

}
