package com.accenture.projectJava.Service;
import com.accenture.projectJava.entity.Curso;
import com.accenture.projectJava.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CursoServiceImpl implements CursoService {

    @Autowired
    private CursoRepository cursoRepository;

    @Override
    public Curso cadastrarCurso(Curso curso) {
        return cursoRepository.save(curso);
    }

    @Override
    public List<Curso> listarCursos(){
        return cursoRepository.findAll();
    }
}
