package inventory;

import java.util.ArrayList;
import java.util.List;

import logger.ActivityLogger;
import observer.Observer;
import product.ProductBase;

public class Inventory {

    private static Inventory instance;
    private final List<Observer> observersList = new ArrayList<>();
    private final InventoryList inventoryList;
    private final AddProductInventory addProductInventory;
    private final FindOneProductById findOneProductById;
    private final RemoveProductFromInventory removeProductFromInventory;

  
    private Inventory() {
        this.inventoryList = InventoryList.getInstance();
        this.addProductInventory = new AddProductInventory();
        this.findOneProductById = new FindOneProductById();
        this.removeProductFromInventory = new RemoveProductFromInventory();
    }

    public static Inventory getInstance() {
        if (instance == null){
        instance = new Inventory();
        }
        return instance;
    }

    public void registerObserver(Observer observer) {
        if (observer != null) {
        observersList.add(observer);
        }
    }

    public void notifyObservers(String message) {
        for (Observer observer: observersList) {
        observer.update(message);
        }
    }

    public List<ProductBase> getAllProducts() {
        return inventoryList.getInventoryList();  
    }

    public void addProduct(ProductBase product) {
        this.addProductInventory.addProduct(product);
        String message = "Le produit suivant a été ajouté à l'inventaire : " + product.getDescription();
        notifyObservers(message);
        ActivityLogger.getInstance().logActivity(message);
    }

    public ProductBase findOneProductById(String id) {
        return this.findOneProductById.findOneProductById(id);
    }

    public void removeOneProductFromInventory(String id) {
        ProductBase product = this.findOneProductById.findOneProductById(id);
        if (product != null) {
            this.removeProductFromInventory.RemoveOneProductFromInventory(id);
            String message = "Le produit suivant a été retiré de l'inventaire : " + product.getDescription();
            notifyObservers(message);
            ActivityLogger.getInstance().logActivity(message);
        }
    }
    
}
