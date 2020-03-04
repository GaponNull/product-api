package org.gaponec.service;

import org.gaponec.dto.ProductDto;

public interface ProductService {
  ProductDto getProductById(Long id);

  ProductDto save(ProductDto productDto);
}
