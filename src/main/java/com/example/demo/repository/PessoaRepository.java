package com.example.demo.repository;

import com.example.demo.modelEntity.Pessoa;
import org.springframework.data.repository.CrudRepository;

public interface PessoaRepository extends CrudRepository<Pessoa, Long> {
}

