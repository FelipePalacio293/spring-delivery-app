package com.delivery.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "items")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_items;
    private String nombre;
    private long precio;
    private long cantidad;
}
