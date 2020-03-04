package org.gaponec.mapper.impl;

import org.gaponec.dto.ProductDto;
import org.gaponec.mapper.ProductMapper;
import org.gaponec.model.Product;

import java.time.LocalDateTime;

public class ProductMapperImpl implements ProductMapper {
  public ProductDto productToProductDto(Product product) {
    return ProductDto.builder()
        .name(product.getName())
        .price(product.getPrice())
        .build();
  }

  public Product productDtoToProduct(ProductDto productDto) {
    return Product.builder()
        .name(productDto.getName())
        .price(productDto.getPrice())
        .createdOn(LocalDateTime.now())
        .build();
  }
}
