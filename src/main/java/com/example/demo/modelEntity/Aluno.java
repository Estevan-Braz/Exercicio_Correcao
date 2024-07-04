package com.example.demo.modelEntity;

import jakarta.persistence.*;

import java.util.Objects;


public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String numeroMatricula;

    private Curso curso;
    @ManyToOne
    private Pessoa pessoa;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(String numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return id == aluno.id  && Objects.equals(numeroMatricula, aluno.numeroMatricula) && curso == aluno.curso && Objects.equals(pessoa, aluno.pessoa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, numeroMatricula, curso, pessoa);
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", numeroMatricula='" + numeroMatricula + '\'' +
                ", curso=" + curso +
                ", pessoa=" + pessoa +
                '}';
    }
}
