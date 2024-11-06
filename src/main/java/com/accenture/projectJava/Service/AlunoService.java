package com.accenture.projectJava.Service;
import com.accenture.projectJava.entity.Aluno;

import java.util.List;

public interface AlunoService {
    Aluno cadastrarAluno(Aluno aluno);
    List<Aluno> listarAlunos();
}
