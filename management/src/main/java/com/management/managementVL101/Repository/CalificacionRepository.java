package com.management.managementVL101.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.management.managementVL101.Model.Calificacion;

public interface CalificacionRepository extends JpaRepository<Calificacion, Long> {
    // Aquí puedes agregar métodos personalizados si es necesario
    // Por ejemplo, para buscar calificaciones por usuario o curso
    
}
