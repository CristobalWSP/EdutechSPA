package com.management.managementVL101.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.management.managementVL101.Model.Incidente;

public interface IncidenteRepository extends JpaRepository<Incidente, Long> {
    // Aquí puedes agregar métodos personalizados si es necesario
    // Por ejemplo, buscar incidentes por tipo, fecha, etc.

    
}
