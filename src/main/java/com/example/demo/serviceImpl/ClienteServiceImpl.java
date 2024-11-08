package com.example.demo.serviceImpl;


import com.example.demo.entity.Cliente;
import com.example.demo.repository.ClienteRepository;
import com.example.demo.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository carritoRepository;

    @Override
    public Cliente create(Cliente clientes) {
        return carritoRepository.save(clientes);
    }

    @Override
    public Cliente update(Cliente clientes) {
        return carritoRepository.save(clientes);
    }

    @Override
    public void delete(Long id) {
        carritoRepository.deleteById(id);
    }

    @Override
    public Optional<Cliente> read(Long id) {
        return carritoRepository.findById(id) ;
    }

    @Override
    public List<Cliente> readAll() {
        return carritoRepository.findAll();
    }
}