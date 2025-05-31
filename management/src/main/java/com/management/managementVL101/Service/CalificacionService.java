package com.management.managementVL101.Service;

import java.util.List;

import com.management.managementVL101.Model.Calificacion;

public interface CalificacionService {

    List<Calificacion> getAllCalificaciones();
    Calificacion getCalificacionById(Long id);
    Calificacion createCalificacion(Long idUsuario, Long idCurso, Calificacion calificacion);
    Calificacion updateCalificacion(Long id, Calificacion calificacion);

    
}

