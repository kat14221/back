package com.example.demo.service;
import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Cliente;
public interface ClienteService {
	 public Cliente create(Cliente clientes);
	    public Cliente update(Cliente esclientescuela);
	    public void delete(Long id);
	    public Optional<Cliente> read(Long id);
	    public List<Cliente> readAll();
}
