package com.management.managementVL101.Service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.management.managementVL101.Model.Calificacion;
import com.management.managementVL101.Model.Curso;
import com.management.managementVL101.Model.Usuario;
import com.management.managementVL101.Repository.CalificacionRepository;
import com.management.managementVL101.Repository.CursoRepository;
import com.management.managementVL101.Repository.UsuarioRepository;

@Service
public class CalificacionServiceImpl implements CalificacionService{
    @Autowired
    private CalificacionRepository calificacionRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private CursoRepository cursoRepository;

    @Override
    public List<Calificacion> getAllCalificaciones() {
        return calificacionRepository.findAll();
    }

    @Override
    public Calificacion getCalificacionById(Long id) {
        return calificacionRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Calificación no encontrada con id: " + id));
    }

    @Override
    public Calificacion createCalificacion(Long idUsuario, Long idCurso, Calificacion calificacion) {
        Usuario usuario = usuarioRepository.findById(idUsuario)
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado con id: " + idUsuario));
        Curso curso = cursoRepository.findById(idCurso)
                .orElseThrow(() -> new RuntimeException("Curso no encontrado con id: " + idCurso));
        
        calificacion.setUsuario(usuario);
        calificacion.setCurso(curso);
        calificacion.setFecha(new Date(System.currentTimeMillis()));
        return calificacionRepository.save(calificacion);
    }

    @Override
    public Calificacion updateCalificacion(Long id, Calificacion calificacion) {
    Calificacion calificacionExistente = getCalificacionById(id);

    calificacionExistente.setPuntuacion(calificacion.getPuntuacion());
    calificacionExistente.setResena(calificacion.getResena());

    return calificacionRepository.save(calificacionExistente);
    }


}

