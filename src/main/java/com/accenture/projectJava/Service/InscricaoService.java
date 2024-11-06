package com.accenture.projectJava.Service;
import com.accenture.projectJava.dto.AlunoDTO;
import com.accenture.projectJava.dto.CursoDTO;
import com.accenture.projectJava.entity.Inscricao;
import java.util.List;

public interface InscricaoService {
    Inscricao inscreveAlunoEmCurso(Long alunoId, Long cursoId);
    List<CursoDTO> listaCursosPorAluno(Long alunoId);
    List<AlunoDTO> listaAlunosPorCurso(Long cursoId);
}
