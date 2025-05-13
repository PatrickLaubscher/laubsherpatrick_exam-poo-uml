
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

        InventoryFacade.getInstance().registerObserver(salesServiceObserver);
        InventoryFacade.getInstance().registerObserver(wharehouseServiceObserver);

        ProductBase ProductE1 = factory.createProduct("E1", "iphone", 600.00, "electronique");
        ProductBase ProductV1 = factory.createProduct("V1", "bonnet", 10.00, "vêtement");
        ProductBase ProductA1 = factory.createProduct("A1", "pain", 1.00, "alimentaire");

        InventoryFacade.getInstance().addProduct(ProductE1);
        InventoryFacade.getInstance().addProduct(ProductV1);
        InventoryFacade.getInstance().addProduct(ProductA1);

        //System.err.println(ProductE1.getDescription());
        //System.err.println(ProductV1.getDescription());
        //System.err.println(ProductA1.getDescription());

        System.err.println(InventoryFacade.getInstance().getAllProducts());

        System.err.println(ActivityLogger.getInstance().getActivityLog());
        

       

        
    }
}