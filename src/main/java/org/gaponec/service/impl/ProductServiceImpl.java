package org.gaponec.service.impl;

import static java.lang.String.format;

import org.gaponec.dto.ProductDto;
import org.gaponec.mapper.ProductMapper;
import org.gaponec.repository.ProductRepository;
import org.gaponec.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

  private final ProductRepository productRepository;
  private final ProductMapper productMapper;

  @Autowired
  public ProductServiceImpl(ProductRepository productRepository, ProductMapper productMapper) {
    this.productRepository = productRepository;
    this.productMapper = productMapper;
  }

  @Override
  public ProductDto getProductById(Long id) {
    return productRepository.findById(id)
        .map(productMapper::productToProductDto)
        .orElseThrow(NoSuchElementException::new);
  }

  @Override
  public ProductDto save(ProductDto productDto) {
    return Optional.ofNullable(productDto)
        .map(productMapper::productDtoToProduct)
        .map(productRepository::save)
        .map(productMapper::productToProductDto)
        .orElseThrow(()
            -> new IllegalArgumentException(format("Error occurred during saving product: %s", productDto.toString())));
  }
}
