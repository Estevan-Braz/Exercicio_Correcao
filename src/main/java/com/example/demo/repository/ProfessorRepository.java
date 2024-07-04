package com.example.demo.repository;

import com.example.demo.modelEntity.Professor;
import org.springframework.data.repository.CrudRepository;

public interface ProfessorRepository extends CrudRepository<Professor, Long> {
    Iterable<Professor> findByEmailAndSenha(String email, String senha);
}