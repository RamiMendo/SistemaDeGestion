package com.ramitax.model;

import com.ramitax.Enum.Unidad;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="envases")
public class Envase {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, unique = true)
    private Integer id;

    @Column(nullable = false, length = 25)
    private String nombre;

    @Column(nullable = false)
    private Integer cantidad;

    @Column(nullable = false)
    private Unidad unidad;

    @Column(nullable = false, name = "es_granel")
    private Boolean esGranel;

    @Column(nullable = false, length = 15)
    private String material;

    @Column(nullable = false)
    private Integer duenio;
}
