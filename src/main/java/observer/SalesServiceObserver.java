package observer;

import product.Product;

public class SalesServiceObserver implements Observer {

    @Override
    public void update(Product product) {
        System.out.println("Message à l'équipe commerciale: " + " Le produit suivant a été ajouté à l'inventaire : " + product.getDescription());
    }

}
