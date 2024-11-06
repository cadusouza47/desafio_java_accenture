package com.accenture.projectJava.repository;
import com.accenture.projectJava.entity.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Long> {}
