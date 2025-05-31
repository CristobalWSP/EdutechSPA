package com.management.managementVL101.Repository;
import com.management.managementVL101.Model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    // La interfaz JpaRepository ya proporciona métodos CRUD básicos
    // Puedes agregar consultas personalizadas si es necesario
}