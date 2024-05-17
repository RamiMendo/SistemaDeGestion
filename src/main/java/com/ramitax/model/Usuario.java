package com.ramitax.model;

import com.ramitax.Enum.Estado;
import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, nullable = false)
    private int id;

    @Column(nullable = false, length = 50)
    private String personName;

    @Column(nullable = false, length = 15)
    private String userName;

    @Column(nullable = false, length = 10)
    private String password;

    @Column(nullable = false)
    private Estado estado;

}
