package com.accenture.projectJava.populator;
import com.accenture.projectJava.dto.AlunoDTO;
import com.accenture.projectJava.dto.CursoDTO;
import com.accenture.projectJava.entity.Aluno;
import com.accenture.projectJava.entity.Curso;
import org.springframework.stereotype.Component;

@Component
public class InscricaoPopulator {
    public AlunoDTO toAlunoDTO(Aluno aluno) {
        AlunoDTO dto = new AlunoDTO();
        dto.setId(aluno.getId());
        dto.setNome(aluno.getNome());
        dto.setEmail(aluno.getEmail());
        return dto;
    }

    public CursoDTO toCursoDTO(Curso curso) {
        CursoDTO dto = new CursoDTO();
        dto.setId(curso.getId());
        dto.setNome(curso.getNome());
        return dto;
    }
}
