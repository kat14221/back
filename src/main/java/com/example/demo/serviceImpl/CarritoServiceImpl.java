package com.example.demo.serviceImpl;


import com.example.demo.entity.Carrito;
import com.example.demo.repository.CarritoRepository;
import com.example.demo.service.CarritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CarritoServiceImpl implements CarritoService {

    @Autowired
    private CarritoRepository carritoRepository;

    @Override
    public Carrito create(Carrito carritos) {
        return carritoRepository.save(carritos);
    }

    @Override
    public Carrito update(Carrito carritos) {
        return carritoRepository.save(carritos);
    }

    @Override
    public void delete(Long id) {
        carritoRepository.deleteById(id);
    }

    @Override
    public Optional<Carrito> read(Long id) {
        return carritoRepository.findById(id) ;
    }

    @Override
    public List<Carrito> readAll() {
        return carritoRepository.findAll();
    }
}