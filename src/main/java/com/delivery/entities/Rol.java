package com.delivery.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Data
@Entity
@Table(name = "roles")
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_rol;
    private String nombre_rol;
    private String descripcion;

    @OneToMany(mappedBy = "rol")
    @JsonIgnore
    private Set<User> users;
}
