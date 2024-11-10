package com.example.demo.service;
import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Alumno;
public interface AlumnoService {
	 public Alumno create(Alumno carritos);
	    public Alumno update(Alumno carritos);
	    public void delete(Long id);
	    public Optional<Alumno> read(Long id);
	    public List<Alumno> readAll();
}
