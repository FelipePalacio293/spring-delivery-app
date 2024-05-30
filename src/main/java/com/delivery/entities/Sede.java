package com.delivery.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "sede")
public class Sede {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id_sede;
    private String nombre_sede;
    private String direccion;
    private long telefono;
}
