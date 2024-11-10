package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="notas")
public class Nota {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
	
	@ManyToOne
    @JoinColumn(name="alumno_id", nullable = false)
    private Alumno alumnos;
	@ManyToOne
    @JoinColumn(name="curso_id", nullable = false)
    private Curso cursos;
	@Column(name="nota1")
    private Double nota1;
	@Column(name="nota2")
    private Double nota2;
	@Column(name="nota3")
    private Double nota3;
	@Column(name="promedio")
    private Double promedio;
	 public void calcularPromedio() {
	        this.promedio = (nota1 + nota2 + nota3) / 3;
	    }
	 @PrePersist
	    @PreUpdate
	    public void prePersistOrUpdate() {
	        calcularPromedio();
	    }
}
