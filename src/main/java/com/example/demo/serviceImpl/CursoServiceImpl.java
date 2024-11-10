package com.example.demo.serviceImpl;


import com.example.demo.entity.Curso;
import com.example.demo.repository.CursoRepository;
import com.example.demo.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CursoServiceImpl implements CursoService {

    @Autowired
    private CursoRepository cursoRepository;

    @Override
    public Curso create(Curso cursos) {
        return cursoRepository.save(cursos);
    }

    @Override
    public Curso update(Curso cursos) {
        return cursoRepository.save(cursos);
    }

    @Override
    public void delete(Long id) {
        cursoRepository.deleteById(id);
    }

    @Override
    public Optional<Curso> read(Long id) {
        return cursoRepository.findById(id) ;
    }

    @Override
    public List<Curso> readAll() {
        return cursoRepository.findAll();
    }
}