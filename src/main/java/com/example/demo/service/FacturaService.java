package com.example.demo.service;
import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Factura;
public interface FacturaService {
	 public Factura create(Factura facturas);
	    public Factura update(Factura facturas);
	    public void delete(Long id);
	    public Optional<Factura> read(Long id);
	    public List<Factura> readAll();
}
