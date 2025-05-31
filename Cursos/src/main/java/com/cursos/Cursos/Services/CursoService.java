package com.cursos.Cursos.Services;

import java.util.List;

import com.cursos.Cursos.Model.Curso;

public interface CursoService{

    List<Curso> getAllCursos();
    Curso getCursoById(Long idCurso);
    Curso saveCurso(Curso curso);
    Curso updateCurso(Long idCurso, Curso curso);
    void deleteCurso(Long idCurso);

    
}