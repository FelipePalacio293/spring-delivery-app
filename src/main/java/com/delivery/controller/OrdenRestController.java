package com.delivery.controller;


import com.delivery.entities.Orden;
import com.delivery.repository.OrdenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/orden")
public class OrdenRestController {
    @Autowired
    OrdenRepository ordenRepository;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping()
    public List<Orden> getAllOrdenes() {
        return ordenRepository.findAll();
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/{id}")
    public ResponseEntity<?> getOrden(@PathVariable long id) {
        Optional<Orden> orden = ordenRepository.findById(id);
        if(orden.isPresent()) {
            return new ResponseEntity<>(orden, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping
    public ResponseEntity<?> createOrden(@RequestBody Orden orden) {
        try {
            orden.setFechaCreacion(LocalDateTime.now());
            Orden savedOrden = ordenRepository.save(orden);
            return new ResponseEntity<>(savedOrden, HttpStatus.OK);
        } catch (IllegalArgumentException e) {
            return new ResponseEntity<>("Invalid input provided", HttpStatus.BAD_REQUEST);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
