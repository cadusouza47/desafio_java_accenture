package com.accenture.projectJava.Controller;
import com.accenture.projectJava.Service.CursoService;
import com.accenture.projectJava.entity.Curso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CursoController {
    @Autowired
    private CursoService cursoService;

    @PostMapping("/cursos")
    public Curso cadastrarCurso(@RequestBody Curso curso){
        return cursoService.cadastrarCurso(curso);
    }

    @GetMapping("/cursos")
    public List<Curso> listarCursos(){
        return cursoService.listarCursos();
    }
}
