package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Carrito;
@Repository
public interface CarritoRepository extends JpaRepository<Carrito, Long> 
 {

}
