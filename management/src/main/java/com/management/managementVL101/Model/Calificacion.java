package com.management.managementVL101.Model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "CALIFICACIONES")
@NoArgsConstructor
@AllArgsConstructor
public class Calificacion {

    @Id
    @Column(name = "ID_CALIFICACION")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCalificacion;

    @ManyToOne
    @JoinColumn(name = "ID_USUARIO")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "ID_CURSO")
    private Curso curso;

    @Column(name = "PUNTUACION")
    private int puntuacion;

    @Column(name = "RESENA")
    private String resena;

    @Column(name = "FECHA")
    private Date fecha;
    
}
