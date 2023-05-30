package task1;

public abstract class Product {
    private String kind;
    private double price;
    private Long id;

    public Product(String name, double price, Long id) {
        this.kind = name;
        this.price = price;
        this.id = id;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
