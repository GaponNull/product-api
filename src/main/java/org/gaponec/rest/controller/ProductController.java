package org.gaponec.rest.controller;

import org.gaponec.dto.ProductDto;
import org.gaponec.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
class ProductController {

  private final ProductService productService;

  ProductController(ProductService productService) {
    this.productService = productService;
  }

  @GetMapping("/products/{id}")
  ProductDto getProduct(@PathVariable Long id) {
    return productService.getProductById(id);
  }

  @PostMapping("/products")
  ProductDto postProduct(@RequestBody ProductDto productDto) {
    return productService.save(productDto);
  }
}
