package com.delivery.entities;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "usuario")
public class User {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private long id_usuario;
    private String nombre;
    private String apellido;
    private String usuario;
    private String contrasenia;
    private Integer id_rol;

    @ManyToOne()
    @JoinColumn(name = "id_rol", insertable = false, updatable = false)
    private Rol rol;
}
