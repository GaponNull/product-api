package org.gaponec.configuration;

import org.gaponec.mapper.ProductMapper;
import org.gaponec.mapper.impl.ProductMapperImpl;
import org.gaponec.repository.ProductRepository;
import org.gaponec.service.ProductService;
import org.gaponec.service.impl.ProductServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductApiConfiguration {
  @Bean
  public ProductService productService(ProductRepository productRepository, ProductMapper productMapper) {
    return new ProductServiceImpl(productRepository, productMapper);
  }

  @Bean
  public ProductMapperImpl productMapper() {
    return new ProductMapperImpl();
  }
}
