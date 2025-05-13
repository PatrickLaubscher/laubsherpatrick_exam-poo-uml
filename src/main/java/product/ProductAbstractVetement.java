package product;


public class ProductAbstractVetement extends ProductBase {

    
    public ProductAbstractVetement(String id, String name, Double price, String category) {
        super(id, name, price, category);
    }
    

    @Override
    public String getDescription() {
        return this.getId() + ", Name: " + this.getName() + ", Price: " + this.getPrice() + ", Category: vêtement";  
    }  


}
