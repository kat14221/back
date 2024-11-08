package com.example.demo.serviceImpl;


import com.example.demo.entity.Factura;
import com.example.demo.repository.FacturaRepository;
import com.example.demo.service.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class FacturaServiceImpl implements FacturaService {

    @Autowired
    private FacturaRepository carritoRepository;

    @Override
    public Factura create(Factura facturas) {
        return carritoRepository.save(facturas);
    }

    @Override
    public Factura update(Factura facturas) {
        return carritoRepository.save(facturas);
    }

    @Override
    public void delete(Long id) {
        carritoRepository.deleteById(id);
    }

    @Override
    public Optional<Factura> read(Long id) {
        return carritoRepository.findById(id) ;
    }

    @Override
    public List<Factura> readAll() {
        return carritoRepository.findAll();
    }
}