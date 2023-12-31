package com.itgenius.springmvcmysqlxon.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itgenius.springmvcmysqlxon.model.Product;
import com.itgenius.springmvcmysqlxon.repository.ProductRepository;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    // Read All products
    @GetMapping("/products")
    public List<Product> findAll(){
        return productRepository.findAll();
    }

    // Read Product by ID
    @GetMapping("/product/{id}")
    public Optional<Product> findProductById(@PathVariable("id") Integer id){
        return productRepository.findById(id);
    }

    // Add new Product
    @PostMapping("/products")
    public Product create(@RequestBody Product product){
        return productRepository.save(product);
    }

    // Update Product
    @PutMapping("/products/{id}")
	public Product update(@PathVariable("id") Integer id, @RequestBody Product productObject) {
		Product product = productRepository.findById(id).get();
		product.setProductName(productObject.getProductName());
		product.setProductPrice(productObject.getProductPrice());
		product.setProductQty(productObject.getProductQty());
		product.setProductStatus(productObject.getProductStatus());

		return productRepository.save(product);
    }
    
    // Delete Product
    @DeleteMapping("/products/{id}")
	public List<Product> delete(@PathVariable("id") Integer id) {
		productRepository.deleteById(id);
		return productRepository.findAll();
	}
    
}
