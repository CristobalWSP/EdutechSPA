package com.management.managementVL101.Service;
import com.management.managementVL101.Model.Incidente;
import java.util.List;



public interface IncidenteService {

    // Métodos para manejar las incidencias
    List<Incidente> getAllIncidencias();
    Incidente getIncidenciaById(Long id);
    Incidente crearIncidencia(Long idUsuario, Incidente incidencia);
    Incidente modificarIncidencia(Long id, Incidente incidencia);

} 
    

