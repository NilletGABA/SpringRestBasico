package com.example.springrest.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;


//LombookS
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
//jpa
@Entity
@Table(name="producto")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="nombre")
    private String name;
    @Column(name="precio")
    private BigDecimal price;

    @ManyToOne
    @JoinColumn(name="id_fabricante",nullable = false)
    @JsonIgnore
    private Maker maker;



}
