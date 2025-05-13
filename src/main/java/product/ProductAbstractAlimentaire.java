package product;

public class ProductAbstractAlimentaire extends ProductBase {

    public ProductAbstractAlimentaire(String id, String name, Double price, String category) {
        super(id, name, price, category);
    }
    

    @Override
    public String getDescription() {
        return this.getId() + ", Name: " + this.getName() + ", Price: " + this.getPrice() + ", Category: alimentaire";  
    }
    
}
