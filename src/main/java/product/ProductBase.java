package product;

public class ProductBase implements Product {

    private final String id;
    private final String name; 
    private final Double price;
    private final String category;
    
    public ProductBase(String id, String name, Double price, String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    @Override
    public String getId() {
        return this.id;
    }
    
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }

    @Override
    public String getCategory() {
        return this.category;
    }


    @Override
    public String getDescription() {
        return "Product ID: " + this.id + ", Name: " + this.name + ", Price: " + this.price + ", Category: " + this.category;
    }  

    
}
