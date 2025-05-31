package com.management.managementVL101.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name = "INCIDENCIAS")



public class Incidente {
    @Id
    @Column(name = "ID_INCIDENCIAS")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idIncidencias;

    @ManyToOne
    @JoinColumn(name = "ID_USUARIOS")
    private Usuario usuarios;

    @Column(name = "DESCRIPCION")
    private String descripcion;

    @Column(name = "STATUS")
    private String status;


}
