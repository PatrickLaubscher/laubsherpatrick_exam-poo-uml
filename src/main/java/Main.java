
import inventory.Inventory;
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

        Inventory.getInstance().registerObserver(salesServiceObserver);
        Inventory.getInstance().registerObserver(wharehouseServiceObserver);

        ProductBase ProductE1 = factory.createProduct("E1", "iphone", 600.00, "electronique");
        ProductBase ProductV1 = factory.createProduct("V1", "bonnet", 10.00, "vêtement");
        ProductBase ProductA1 = factory.createProduct("A1", "pain", 1.00, "alimentaire");

        Inventory.getInstance().addProduct(ProductE1);
        Inventory.getInstance().addProduct(ProductV1);
        Inventory.getInstance().addProduct(ProductA1);

        //System.err.println(ProductE1.getDescription());
        //System.err.println(ProductV1.getDescription());
        //System.err.println(ProductA1.getDescription());

        System.err.println(ActivityLogger.getInstance().getActivityLog());
        

       

        
    }
}