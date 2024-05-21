package com.ramitax.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name="articulos_comestibles")
public class Comestible extends Articulo{

    @Column(nullable = false, name = "ean")
    private String EAN;

    @Column(nullable = false, name = "especie")
    private Integer especie;

    @Column(nullable = false, name = "categoria")
    private Integer categoria;

    @OneToOne
    private Envase envase;

}
