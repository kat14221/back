package com.example.demo.serviceImpl;


import com.example.demo.entity.Alumno;
import com.example.demo.repository.AlumnoRepository;
import com.example.demo.service.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class AlumnoServiceImpl implements AlumnoService {

    @Autowired
    private AlumnoRepository alumnoRepository;

    @Override
    public Alumno create(Alumno alumnos) {
        return alumnoRepository.save(alumnos);
    }

    @Override
    public Alumno update(Alumno alumnos) {
        return alumnoRepository.save(alumnos);
    }

    @Override
    public void delete(Long id) {
        alumnoRepository.deleteById(id);
    }

    @Override
    public Optional<Alumno> read(Long id) {
        return alumnoRepository.findById(id) ;
    }

    @Override
    public List<Alumno> readAll() {
        return alumnoRepository.findAll();
    }
}