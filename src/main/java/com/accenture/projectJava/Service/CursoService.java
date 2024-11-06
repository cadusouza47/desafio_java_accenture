package com.accenture.projectJava.Service;
import com.accenture.projectJava.entity.Curso;
import java.util.List;

public interface CursoService {
    Curso cadastrarCurso(Curso curso);
    List<Curso> listarCursos();
}
