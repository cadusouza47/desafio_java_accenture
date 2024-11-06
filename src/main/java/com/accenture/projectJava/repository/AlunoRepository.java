package com.accenture.projectJava.repository;
import com.accenture.projectJava.entity.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {}
