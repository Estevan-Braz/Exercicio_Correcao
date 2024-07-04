package com.example.demo.controller;

import com.example.demo.modelEntity.Professor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path= "/professor")
public class ProfessorRepository {

    private com.example.demo.repository.ProfessorRepository professorRepository;

    @GetMapping(path="/realizarLogin")
    public List<Professor> realizarLogin(
            @RequestParam String email,
            @RequestParam String senha
    ){
        return professorRepository.findByEmailAndSenha(email, senha);
    }
}
