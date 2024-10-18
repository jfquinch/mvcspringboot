package taller.mvcspringboottaller;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<ProductEntity> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public ProductEntity getProductById(@PathVariable UUID id) {
        return productService.getProductById(id);
    }

    @PostMapping
    public void createProduct(@RequestBody ProductEntity product) {
        productService.createProduct(product);
    }

    @PutMapping("/{id}")
    public void updateProduct(@PathVariable UUID id, @RequestBody ProductEntity product) {
        productService.updateProduct(id, product);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable UUID id) {
        productService.deleteProduct(id);
    }
}
