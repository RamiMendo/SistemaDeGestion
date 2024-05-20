package com.ramitax.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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

    @Column(nullable = false, name = "envase_primario")
    private Integer envasePrimario;

    @Column(nullable = true, name = "envase_secundaio")
    private Integer envaseSecundario;

    @Column(nullable = false, name = "cantidad_envase")
    private Integer cantidadEnvase;

}
