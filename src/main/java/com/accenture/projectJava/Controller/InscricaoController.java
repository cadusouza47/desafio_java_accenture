package com.accenture.projectJava.Controller;
import com.accenture.projectJava.Service.InscricaoService;
import com.accenture.projectJava.dto.AlunoDTO;
import com.accenture.projectJava.dto.CursoDTO;
import com.accenture.projectJava.entity.Inscricao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
public class InscricaoController {
    @Autowired
    private InscricaoService inscricaoService;

    @PostMapping("/inscrever")
    public Inscricao inscreveAlunoEmCurso(@RequestParam Long alunoId, @RequestParam Long cursoId){
        return inscricaoService.inscreveAlunoEmCurso(alunoId, cursoId);
    }

    @GetMapping("/cursosPorAluno/{alunoId}")
    public List<CursoDTO> listaCursosPorAluno(@PathVariable Long alunoId) {
        return inscricaoService.listaCursosPorAluno(alunoId);
    }

    @GetMapping("/alunosPorCurso/{cursoId}")
    public List<AlunoDTO> listaAlunosPorCurso(@PathVariable Long cursoId) {
        return inscricaoService.listaAlunosPorCurso(cursoId);
    }
}
