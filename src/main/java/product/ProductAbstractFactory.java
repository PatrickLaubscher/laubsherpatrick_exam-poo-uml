package product;

public class ProductAbstractFactory {

    public ProductBase createProduct(String id, String name, Double price, String category) {

    switch(category.toLowerCase()) {
        case "electronique" ->
            { return new ProductAbstractElectronique(id, name, price, category) ;} 
        case "vêtement" ->
            { return new ProductAbstractVetement(id, name, price, category); }
        case "alimentaire" ->
            { return new ProductAbstractAlimentaire(id, name, price, category); }
        default ->
            throw new IllegalArgumentException("Unknown category: " + category);

        }
    }

    
}
