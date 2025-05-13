package observer;

import product.Product;

public class WharehouseServiceObserver implements Observer {

        @Override
    public void update(Product product) {
        System.out.println("Message à l'entrepôt: " + " Le produit suivant a été ajouté à l'inventaire : " + product.getDescription());
    }
}
