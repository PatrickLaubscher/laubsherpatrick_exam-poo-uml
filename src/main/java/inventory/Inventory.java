package inventory;

import java.util.ArrayList;
import java.util.List;

import logger.ActivityLogger;
import observer.Observer;
import product.Product;

public class Inventory {

    private static Inventory instance;
    private final List<String> inventoryList;
    private final List<Observer> observersList = new ArrayList<>();
  
    private Inventory() {
        this.inventoryList = new ArrayList<>();
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
        return this.inventoryList;
    }

    public void addProduct(Product product) {
        this.inventoryList.add(product.getDescription());
        notifyObservers(product);
        ActivityLogger.getInstance().logActivity("Le produit suivant a été ajouté à l'inventaire : " + product.getDescription());
    }

    
}
