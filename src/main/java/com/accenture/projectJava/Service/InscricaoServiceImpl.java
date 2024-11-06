package com.accenture.projectJava.Service;
import com.accenture.projectJava.dto.AlunoDTO;
import com.accenture.projectJava.dto.CursoDTO;
import com.accenture.projectJava.entity.Aluno;
import com.accenture.projectJava.entity.Curso;
import com.accenture.projectJava.entity.Inscricao;
import com.accenture.projectJava.repository.AlunoRepository;
import com.accenture.projectJava.repository.CursoRepository;
import com.accenture.projectJava.repository.InscricaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class InscricaoServiceImpl implements InscricaoService{
    @Autowired
    private AlunoRepository alunoRepository;
    @Autowired
    private CursoRepository cursoRepository;
    @Autowired
    private InscricaoRepository inscricaoRepository;

    @Override
    public Inscricao inscreveAlunoEmCurso(Long alunoId, Long cursoId) {
        Aluno aluno = alunoRepository.findById(alunoId).orElseThrow(() -> new RuntimeException("Aluno não encontrado"));
        Curso curso = cursoRepository.findById(cursoId).orElseThrow(() -> new RuntimeException("Curso não encontrado"));

        Inscricao inscricao = new Inscricao();
        inscricao.setAluno(aluno);
        inscricao.setCurso(curso);
        inscricao.setDataInscricao(new java.util.Date());

        return inscricaoRepository.save(inscricao);
    }

    @Override
    public List<CursoDTO> listaCursosPorAluno(Long alunoId) {
        List<Inscricao> inscricoes = inscricaoRepository.findByAlunoId(alunoId);
        return inscricoes.stream()
                .map(inscricao -> new CursoDTO())
                .collect(Collectors.toList());

    }

    @Override
    public List<AlunoDTO> listaAlunosPorCurso(Long cursoId) {
        List<Inscricao> inscricoes = inscricaoRepository.findByCursoId(cursoId);
        return inscricoes.stream()
                .map(inscricao -> new AlunoDTO())
                .collect(Collectors.toList());

    }

}
