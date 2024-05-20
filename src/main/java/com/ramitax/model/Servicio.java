package com.ramitax.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name="articulos_servicios")
public class Servicio extends Articulo{

    @Column(nullable = false, name = "cuenta")
    private Double cuenta;

}
