package taller.mvcspringboottaller;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ProductService {

    private final List<ProductEntity> products = new ArrayList<>();

    public List<ProductEntity> getAllProducts() {
        return products;
    }

    public ProductEntity getProductById(UUID id) {
        return products.stream()
                .filter(product -> product.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public void createProduct(ProductEntity product) {
        product.setId(UUID.randomUUID());  // Asigna un ID único
        products.add(product);  // Agrega el producto a la lista
    }

    public void updateProduct(UUID id, ProductEntity updatedProduct) {
        ProductEntity product = getProductById(id);
        if (product != null) {
            product.setName(updatedProduct.getName());
            product.setPrice(updatedProduct.getPrice());
            // Actualiza otros campos según sea necesario
        }
    }

    public void deleteProduct(UUID id) {
        products.removeIf(product -> product.getId().equals(id));
    }
}
