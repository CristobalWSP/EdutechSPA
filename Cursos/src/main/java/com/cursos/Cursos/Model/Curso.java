package com.cursos.Cursos.Model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
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
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long idCurso;

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
