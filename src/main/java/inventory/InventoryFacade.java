package inventory;

import java.util.ArrayList;
import java.util.List;

import logger.ActivityLogger;
import observer.Observer;
import product.Product;

public class InventoryFacade {

    private static InventoryFacade instance;
    private final List<Observer> observersList = new ArrayList<>();
    private final InventoryList inventoryList;
    private final AddProductInventory addProductInventory;

  
    private InventoryFacade() {
        this.addProductInventory = new AddProductInventory();
        this.inventoryList = InventoryList.getInstance();

    }

    public static InventoryFacade getInstance() {
        if (instance == null){
        instance = new InventoryFacade();
        }
        return instance;
    }

    public void registerObserver(Observer observer) {
        if (observer != null) {
        observersList.add(observer);
        }
    }

    public void notifyObservers(Product product) {
        for (Observer observer: observersList) {
        observer.update(product);;
        }
    }

    public List<String> getAllProducts() {
        return inventoryList.getInventoryList();  
    }

    public void addProduct(Product product) {
        this.addProductInventory.addProduct(product);
        notifyObservers(product);
        ActivityLogger.getInstance().logActivity("Le produit suivant a été ajouté à l'inventaire : " + product.getDescription());
    }



    
}
