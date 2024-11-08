package com.example.demo.service;
import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Carrito;
public interface CarritoService {
	 public Carrito create(Carrito carritos);
	    public Carrito update(Carrito carritos);
	    public void delete(Long id);
	    public Optional<Carrito> read(Long id);
	    public List<Carrito> readAll();
}
