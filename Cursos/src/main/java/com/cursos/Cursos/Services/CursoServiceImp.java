package com.cursos.Cursos.Services;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cursos.Cursos.Model.Curso;
import com.cursos.Cursos.Repository.CursoRepo;

@Service
public class CursoServiceImp implements CursoService {

    @Autowired
    private CursoRepo cursoRepo;

    @Override
    public List<Curso> getAllCursos() {
        return cursoRepo.findAll();
    }

    @Override
    public Curso getCursoById(Long idCurso) {
        return cursoRepo.findById(idCurso).orElse(null);
    }

    @Override
    public Curso saveCurso(Curso curso) {
        return cursoRepo.save(curso);
    }

    @Override
    public Curso updateCurso(Long idCurso, Curso curso) {
        if (cursoRepo.existsById(idCurso)) {
            curso.setIdCurso(idCurso);
            return cursoRepo.save(curso);
        }
        return null; // or throw an exception
    }

    @Override
    public void deleteCurso(Long idCurso) {
        cursoRepo.deleteById(idCurso);
    }

    
}
