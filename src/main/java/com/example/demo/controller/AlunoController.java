package com.example.demo.controller;

import com.example.demo.modelEntity.Aluno;
import com.example.demo.modelEntity.Curso;
import com.example.demo.modelEntity.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/aluno")
public class AlunoController {
    private com.example.demo.repository.AlunoRepository alunoRepository;

    @GetMapping(path="/pegarPorCurso")
    public Iterable<Aluno> pegarAlunosPorCurso(
            @RequestParam Curso curso
    ){
        return alunoRepository.findByCurso(curso);
    }
}
