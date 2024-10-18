package taller.mvcspringboottaller;

import java.util.UUID;

public class ProductEntity {

    private UUID id;
    private String name;
    private String category;
    private double price;
    private int stock;

    // Constructor vacío
    public ProductEntity() {}

    // Constructor con parámetros
    public ProductEntity(String name, String category, double price, int stock) {
        this.id = UUID.randomUUID(); // Genera un ID único al crear el producto
        this.name = name;
        this.category = category;
        this.price = price;
        this.stock = stock;
    }

    // Getters y setters
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
