package inventory;

import java.util.ArrayList;
import java.util.List;

import logger.ActivityLogger;
import observer.Observer;
import product.Product;

public class Inventory {

    private static Inventory instance;
    private final List<Observer> observersList = new ArrayList<>();
    private final InventoryList inventoryList;
    private final AddProductInventory addProductInventory;
    private final FindOneProductById findOneProductById;

  
    private Inventory() {
        this.inventoryList = InventoryList.getInstance();
        this.addProductInventory = new AddProductInventory();
        this.findOneProductById = new FindOneProductById();

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

    public String findOneProductById(String id) {
        return findOneProductById.findOneProductById(id);
    }


    
}
