package com.management.managementVL101.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "CURSOS")
@NoArgsConstructor
@AllArgsConstructor
public class Curso {
    
    @Id
    @Column(name = "ID_CURSO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // Nota: Si Oracle usa secuencias, considera cambiar a:
    // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usuario_seq")
    // @SequenceGenerator(name = "usuario_seq", sequenceName = "USUARIO_SEQ", allocationSize = 1)
    private Long id_Curso;
    
    @Column(name = "PRECIO")
    private int precio;
    
    @Column(name = "CURSO_NOMBRE")
    private String cursoNombre;
    
    @Column(name = "DESCRIPCION")
    private String descripcion;
    
    @Column(name = "CATEGORIA")
    private String categoria;

    @Column(name = "ESTUDIANTE_CAPACIDAD")
    private int estudianteCapacidad;
}
