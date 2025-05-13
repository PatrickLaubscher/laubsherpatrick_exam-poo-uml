
import inventory.InventoryFacade;
import logger.ActivityLogger;
import observer.SalesServiceObserver;
import observer.WharehouseServiceObserver;
import product.ProductAbstractFactory;
import product.ProductBase;


public class Main {
    public static void main(String[] args) {

        ProductAbstractFactory factory = new ProductAbstractFactory();
        SalesServiceObserver salesServiceObserver = new SalesServiceObserver();
        WharehouseServiceObserver wharehouseServiceObserver = new WharehouseServiceObserver();

        InventoryFacade inventory = InventoryFacade.getInstance();

        inventory.registerObserver(salesServiceObserver);
        inventory.registerObserver(wharehouseServiceObserver);

        ProductBase ProductE1 = factory.createProduct("E1", "iphone", 600.00, "electronique");
        ProductBase ProductV1 = factory.createProduct("V1", "bonnet", 10.00, "vêtement");
        ProductBase ProductA1 = factory.createProduct("A1", "pain", 1.00, "alimentaire");

        inventory.addProduct(ProductE1);
        inventory.addProduct(ProductV1);
        inventory.addProduct(ProductA1);

        //System.err.println(ProductE1.getDescription());
        //System.err.println(ProductV1.getDescription());
        //System.err.println(ProductA1.getDescription());

        System.err.println(inventory.getAllProducts());

        System.err.println(ActivityLogger.getInstance().getActivityLog());
        
        System.err.println(inventory.findProductById("E1"));
       

        
    }
}