package com.example.demo.controller;


import com.example.demo.entity.Carrito;
import com.example.demo.service.CarritoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/api/carritos")
@CrossOrigin(origins = "http://localhost:4200")
public class CarritoController {
    @Autowired
    private CarritoService carritosService;

    @GetMapping
    public ResponseEntity<List<Carrito>> readAll(){
        try {
            List<Carrito> carritoss = carritosService.readAll();
            if(carritoss.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(carritoss, HttpStatus.OK);
        } catch (Exception e) {
            // TODO: handle exception
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
    @PostMapping
    public ResponseEntity<Carrito> crear(@Valid @RequestBody Carrito carritos) {
        try {
            Carrito c = carritosService.create(carritos);
            return new ResponseEntity<>(c, HttpStatus.CREATED);
        } catch (Exception e) {
            // TODO: handle exception
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
    @GetMapping("/{id}")
    public ResponseEntity<Carrito> getCarritoId(@PathVariable("id") Long id){
        try {
            Carrito c = carritosService.read(id).get();
            return new ResponseEntity<>(c, HttpStatus.CREATED);
        } catch (Exception e) {
            // TODO: handle exception
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Carrito> delCarrito(@PathVariable("id") Long id){
        try {
            carritosService.delete(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            // TODO: handle exception
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
    @PutMapping("/{id}")
    public ResponseEntity<?> updateCarrito(@PathVariable("id") Long id, @Valid @RequestBody Carrito carritos){

        Optional<Carrito> c = carritosService.read(id);
        if(c.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }else {
            return new ResponseEntity<>(carritosService.update(carritos), HttpStatus.OK);
        }

    }
}
