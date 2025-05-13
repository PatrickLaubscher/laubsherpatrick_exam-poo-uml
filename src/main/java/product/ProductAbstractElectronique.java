package product;


public class ProductAbstractElectronique extends ProductBase {

    
    public ProductAbstractElectronique(String id, String name, Double price, String category) {
        super(id, name, price, category);
    }
    

    @Override
    public String getDescription() {
        return this.getId() + ", Name: " + this.getName() + ", Price: " + this.getPrice() + ", Category: électronique";  
    }  


}