package org.gaponec.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "product")
@Builder
@Data
@NoArgsConstructor
public class Product {
  @Id
  @Column(name = "id")
  private Long id;
  @Column(name = "name")
  private String name;
  @Column(name = "price")
  private Integer price;
  @Column(name = "created_by")
  private String createdBy;
  @Column(name = "created_on")
  private LocalDateTime createdOn;
}

