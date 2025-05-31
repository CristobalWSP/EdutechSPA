package com.management.managementVL101.Controller;
import com.management.managementVL101.DTO.CalificacionRequest;
import com.management.managementVL101.Model.Calificacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;
import com.management.managementVL101.Service.CalificacionService;

@RestController
@RequestMapping("/api/calificaciones")
public class CalificacionController {

    @Autowired
    private CalificacionService calificacionService;

    @GetMapping
    public ResponseEntity<List<Calificacion>> getAllCalificaciones() {
        return new ResponseEntity<>(calificacionService.getAllCalificaciones(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Calificacion> getCalificacionById(@PathVariable Long id) {
        return new ResponseEntity<>(calificacionService.getCalificacionById(id), HttpStatus.OK);
    }

    @PostMapping("/inCalificacion")
    public ResponseEntity<Calificacion> createCalificacion(
        @RequestBody CalificacionRequest request) {
            Calificacion calificacion = new Calificacion();
            calificacion.setPuntuacion(request.getPuntuacion());
            calificacion.setResena(request.getResena());

            Calificacion nuevaCalificacion = calificacionService.createCalificacion(
                request.getIdUsuario(),
                request.getIdCurso(),
                calificacion
            );
            return new ResponseEntity<>(nuevaCalificacion, HttpStatus.CREATED);
    }

    @PutMapping("/{id}/modificar")
    public ResponseEntity<Calificacion> updateCalificacion(@PathVariable Long id, @RequestBody Calificacion calificacion) {
        Calificacion actualizado = calificacionService.updateCalificacion(id, calificacion);
        return ResponseEntity.ok(actualizado);
    }

    
}
