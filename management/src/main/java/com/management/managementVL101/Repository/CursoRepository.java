package com.management.managementVL101.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.management.managementVL101.Model.Curso;

public interface CursoRepository  extends JpaRepository<Curso, Long> {
    // Aquí puedes agregar métodos personalizados si es necesario
    // Por ejemplo, buscar cursos por nombre, etc.

    
} 

