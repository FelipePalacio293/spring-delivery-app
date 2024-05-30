package com.delivery.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "clientes")
public class Cliente {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private long id_clientes;
    private long cedula;
    private String apellidos;
    private String nombre;
    private long telefono;
    private String direccion;
}
