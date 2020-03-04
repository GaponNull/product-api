package org.gaponec.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
public class ProductDto {
  private String name;
  private int price;
}
