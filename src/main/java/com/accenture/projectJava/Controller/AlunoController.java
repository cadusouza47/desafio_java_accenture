package com.accenture.projectJava.Controller;
import com.accenture.projectJava.Service.AlunoService;
import com.accenture.projectJava.entity.Aluno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AlunoController {
    @Autowired
    private AlunoService alunoService;

    @PostMapping("/alunos")
    public Aluno cadastrarAluno(@RequestBody Aluno aluno) {
        return alunoService.cadastrarAluno(aluno);
    }

    @GetMapping("/alunos")
    public List<Aluno> listarAlunos() {
        return alunoService.listarAlunos();
    }
}
