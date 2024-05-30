package com.delivery.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "ordenes")
public class Orden {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private long id_ordenes;

    @Column(name = "id_clientes")
    private long idCliente;
    @Column(name = "id_sede")
    private long idSede;
    @Column(name = "id_item")
    private long idItem;

    private Integer estado;

    @Column(name = "fecha_creacion")
    private LocalDateTime fechaCreacion;

    @ManyToOne()
    @JoinColumn(name = "id_clientes", insertable = false, updatable = false)
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "id_sede", insertable = false, updatable = false)
    private Sede sede;

    @ManyToOne
    @JoinColumn(name = "id_item" ,insertable = false, updatable = false)
    private Item item;
}
