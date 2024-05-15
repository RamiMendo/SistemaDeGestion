package com.ramitax.model;

import com.ramitax.Enum.Estado;
import jakarta.persistence.*;
import lombok.*;

@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String userName;
    private String password;
    private Estado estado;

}
