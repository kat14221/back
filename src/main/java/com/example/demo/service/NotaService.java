package com.example.demo.service;
import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Nota;
public interface NotaService {
	 public Nota create(Nota facturas);
	    public Nota update(Nota facturas);
	    public void delete(Long id);
	    public Optional<Nota> read(Long id);
	    public List<Nota> readAll();
}
