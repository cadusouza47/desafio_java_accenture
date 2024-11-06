package com.accenture.projectJava.Service;
import com.accenture.projectJava.entity.Aluno;
import com.accenture.projectJava.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AlunoSerivceImpl implements AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    @Override
    public Aluno cadastrarAluno(Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    @Override
    public List<Aluno> listarAlunos() {
        return alunoRepository.findAll();
    }
}
