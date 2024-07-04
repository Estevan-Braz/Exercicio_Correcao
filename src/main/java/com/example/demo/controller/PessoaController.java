package com.example.demo.controller;

import com.example.demo.modelEntity.Aluno;
import com.example.demo.modelEntity.Curso;
import com.example.demo.modelEntity.Pessoa;
import com.example.demo.modelEntity.Professor;
import com.example.demo.repository.AlunoRepository;
import com.example.demo.repository.PessoaRepository;
import com.example.demo.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;

@RestController
@RequestMapping(path="/pessoa")
public class PessoaController {
    private PessoaRepository pessoaRepositorio;
    private ProfessorRepository professorRepository;
    private AlunoRepository alunoRepository;

    @PostMapping(path="/addProfessor")
    public String addProfessor(
            @RequestParam String nome,
            @RequestParam String email,
            @RequestParam @DateTimeFormat(pattern="dd/MM/yyyy") Date data_nascimento,
            @RequestParam String siape,
            @RequestParam String senha,
            @RequestParam @DateTimeFormat(pattern="dd/MM/yyyy") Date dataInicioTrabalho
            ){

        Pessoa pessoa = new Pessoa();
        Professor professor = new Professor();
        professor.setSIAPE(siape);
        professor.setDataInicioTrabalho(dataInicioTrabalho);
        professor.setSenha(senha);
        professor.setPessoa(pessoa);
        professor = professorRepository.save(professor);


        pessoa.setNome(nome);
        pessoa.setEmail(email);
        pessoa.setData_nascimento(data_nascimento);
        pessoa = pessoaRepositorio.save(pessoa);


        return professor.toString();
    }

    @PostMapping(path="/addAluno")
    public String addAluno(
            @RequestParam String nome,
            @RequestParam String email,
            @RequestParam @DateTimeFormat(pattern="dd/MM/yyyy") Date dataNascimento,
            @RequestParam String numeroMatricula,
            @RequestParam Curso curso
            ){
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(nome);
        pessoa.setEmail(email);
        pessoa.setData_nascimento(dataNascimento);
        pessoa = pessoaRepositorio.save(pessoa);

        Aluno aluno = new Aluno();
        aluno.setNumeroMatricula(numeroMatricula);
        aluno.setPessoa(pessoa);
        aluno.setCurso(curso);
        aluno = alunoRepository.save(aluno);
        return aluno.toString();
    }

    @GetMapping(path= "/all")
    public ArrayList<Pessoa> getAll(){
        return pessoaRepositorio.findAll();
    }
}