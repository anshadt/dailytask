package com.Controller;
import com.Entity.Product;
import com.Repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Producer;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Product")
public class ProductController {

    @Autowired
    private Repository Repository;

    @PostMapping
    public Product createProduct(@RequestBody Producer Product) {
        return Repository.save(Product);
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return Repository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Product> getProductById(@PathVariable Long id) {
        return Repository.findById(id);
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable Long id, @RequestBody Product updatedProduct) {
        updatedProduct.setId(id); // Set the ID of the existing product
        return Repository.save(updatedProduct);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) {
        Repository.deleteById(id);
    }
}