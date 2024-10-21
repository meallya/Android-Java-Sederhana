package ac.id.unsera.tugasppm1allya;

public class Product {
    private String name;
    private String price;

    // Constructor
    public Product(String name, String price) {
        this.name = name;
        this.price = price;
    }

    // Getter untuk nama produk
    public String getName() {
        return name;
    }

    // Getter untuk harga produk
    public String getPrice() {
        return price;
    }
}

