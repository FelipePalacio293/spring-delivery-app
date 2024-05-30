package com.delivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.delivery.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    Cliente findByCedula(long cedula);
}
