package com.cursos.Cursos.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.cursos.Cursos.Model.Curso;

public interface CursoRepo extends JpaRepository<Curso, Long> {

    
} 