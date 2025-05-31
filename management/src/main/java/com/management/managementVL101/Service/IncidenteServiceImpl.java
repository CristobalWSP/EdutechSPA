package com.management.managementVL101.Service;
import com.management.managementVL101.Model.Incidente;
import com.management.managementVL101.Model.Usuario;
import com.management.managementVL101.Repository.IncidenteRepository;
import com.management.managementVL101.Repository.UsuarioRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IncidenteServiceImpl implements IncidenteService {

    @Autowired
    private IncidenteRepository incidenteRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public List<Incidente> getAllIncidencias() {
        return incidenteRepository.findAll();
    }

	@Override
    public Incidente getIncidenciaById(Long id) {
        return incidenteRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Incidencia no encontrada con id: " + id));
    }

    public Incidente crearIncidencia(Long idUsuario, Incidente incidencia) {
    Usuario usuario = usuarioRepository.findById(idUsuario)
        .orElseThrow(() -> new RuntimeException("Usuario no encontrado con id: " + idUsuario));
    incidencia.setUsuarios(usuario);

    if (incidencia.getDescripcion() == null) {
        incidencia.setDescripcion("Descripción genérica");
    }
    if (incidencia.getStatus() == null) {
        incidencia.setStatus("Abierta");
    }

    return incidenteRepository.save(incidencia);
    }

    @Override
    public Incidente modificarIncidencia(Long id, Incidente incidencia) {
        Incidente incidenciaExistente = getIncidenciaById(id);
        incidenciaExistente.setDescripcion(incidencia.getDescripcion());
        incidenciaExistente.setStatus(incidencia.getStatus());
        return incidenteRepository.save(incidenciaExistente);
    }

	
}