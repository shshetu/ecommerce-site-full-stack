package com.shetu.ecommerce.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/*
  * Primitive types:
  ---------------------
  boolean – 1 bit
  byte – 8 bits (1 byte)
  short, char – 16 bits (2 byte)
  int, float – 32 bits (4 byte)
  long, double – 64 bits (8 byte)

  Object types:
  ---------------
  Boolean – 128 bits (16 byte)
  Byte – 128 bits (16 byte)
  Short, Character – 128 bits (16 byte)
  Integer, Float – 128 bits (16 byte)
  Long, Double – 192 bits (24 byte)
  *
  * BigDecimal:
  ----------------
  * A BigDecimal consists of a random precision integer unscaled value and a 32-bit integer scale.
  * If greater than or equal to zero, the scale is the number of digits to the right of the decimal point.
  * If less than zero, the unscaled value of the number is multiplied by 10^(-scale).
  * * */

@Entity
@Table(name = "product")
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @ManyToOne
    @JoinColumn(name = "category_id",nullable = false)
    private ProductCategory productCategory;
    @Column(name = "sku")
    private String sku;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "unit_price")
    private BigDecimal unitPrice;
    @Column(name = "image_url")
    private String imageUrl;
    @Column(name = "active")
    private Boolean active;
    @Column(name = "units_in_stock")
    private Integer unitsInStock;
    @Column(name = "date_created")
    @CreationTimestamp
    private Date dateCreated;
    @Column(name = "last_updated")
    @UpdateTimestamp
    private Date lastUpdated;
}
