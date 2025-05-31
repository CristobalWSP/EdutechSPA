package com.management.managementVL101.Controller;
import com.management.managementVL101.Service.IncidenteService;
import com.management.managementVL101.Model.Incidente;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;




@RestController
@RequestMapping("/api/incidentes")
public class IncidenteController {
    
    @Autowired
    private IncidenteService incidenteService;

    @GetMapping
    public ResponseEntity<List<Incidente>> getAllIncidencias() {
        return new ResponseEntity<>(incidenteService.getAllIncidencias(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Incidente> getIncidenciaById(@PathVariable Long id) {
        return new ResponseEntity<>(incidenteService.getIncidenciaById(id), HttpStatus.OK);
        
    }

    @GetMapping("/{id}/modificar")
    public ResponseEntity<Incidente> modificarIncidencia(@PathVariable Long id, @RequestBody Incidente incidente) {
        Incidente actualizado = incidenteService.modificarIncidencia(id, incidente);
        return ResponseEntity.ok(actualizado);
    }

    @PostMapping("/{id}/gnIncidente")
    public ResponseEntity<Incidente> crearIncidencia(@PathVariable("id") Long idUsuario, @RequestBody Incidente incidente) {
        Incidente nuevaIncidencia = incidenteService.crearIncidencia(idUsuario, incidente);
        return new ResponseEntity<>(nuevaIncidencia, HttpStatus.CREATED);
    }
    

}
