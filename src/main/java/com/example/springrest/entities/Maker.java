package com.example.springrest.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

//lombook
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
//jpa
@Entity
@Table(name="fabricante")
public class Maker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="nombre")
    private String name;
    //relacion de uno a muchos
    //Un fabricante puede realizar muchos productos
    //Primero se mapea, segundo cualquier en movimiento en cascada tambien se haga en el producto
    //fetch sirve para que no sobrecargue la lista cuando tenga un creador.
    //orphanremoval si yo elimino un creador automaticamente se elimina los productos.
    @OneToMany(mappedBy = "maker",cascade = CascadeType.ALL, fetch = FetchType.LAZY,orphanRemoval = true)
    @JsonIgnore
    private List<Product> productList=new ArrayList<>();
}
