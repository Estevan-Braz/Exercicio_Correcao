package com.example.demo.repository;

import com.example.demo.modelEntity.Aluno;
import com.example.demo.modelEntity.Curso;
import org.springframework.data.repository.CrudRepository;

public interface AlunoRepository extends CrudRepository<Aluno, Long> {
    Iterable<Pessoa> findByNomeDoCurso(Curso curso);
}