package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Nota;
@Repository
public interface NotaRepository extends JpaRepository<Nota, Long> 
 {

}
