package org.gaponec.mapper;

import org.gaponec.dto.ProductDto;
import org.gaponec.model.Product;

public interface ProductMapper {
  ProductDto productToProductDto(Product product);

  Product productDtoToProduct(ProductDto productDto);
}
