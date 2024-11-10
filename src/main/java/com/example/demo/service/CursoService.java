package com.example.demo.service;
import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Curso;
public interface CursoService {
	 public Curso create(Curso clientes);
	    public Curso update(Curso esclientescuela);
	    public void delete(Long id);
	    public Optional<Curso> read(Long id);
	    public List<Curso> readAll();
}
