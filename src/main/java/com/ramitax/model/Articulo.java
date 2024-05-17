package com.ramitax.model;

import com.ramitax.Enum.Estado;
import jakarta.persistence.*;
import lombok.*;

@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public abstract class Articulo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false, length = 50)
    private String nombre;

    @Column(nullable = false, name = "iva")
    private Double IVA;

    @Column(nullable = false, name = "es_exento")
    private Boolean esExento;

    @Column(nullable = false, name = "no_grabado")
    private Boolean noGrabado;

    @Column(nullable = false, name = "estado")
    private Estado estado;
}
