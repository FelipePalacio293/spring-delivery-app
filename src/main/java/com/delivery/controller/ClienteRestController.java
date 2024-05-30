package com.delivery.controller;


import com.delivery.entities.Cliente;
import com.delivery.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteRestController {
    @Autowired
    ClienteRepository clienteRepository;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping()
    public List<Cliente> getAllClientes() {
        return clienteRepository.findAll();
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping()
    public Cliente createCliente(@RequestBody Cliente cliente) {
        return clienteRepository.save(cliente);
    }
}
