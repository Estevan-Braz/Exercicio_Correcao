package com.example.demo.modelEntity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Objects;

@Entity
public class Professor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String SIAPE;
    private Date dataInicioTrabalho;
    private String senha;
    @ManyToOne
    @JoinColumn(name="fk_id_pessoa")
    private Pessoa pessoa;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSIAPE() {
        return SIAPE;
    }

    public void setSIAPE(String SIAPE) {
        this.SIAPE = SIAPE;
    }

    public Date getDataInicioTrabalho() {
        return dataInicioTrabalho;
    }

    public void setDataInicioTrabalho(Date dataInicioTrabalho) {
        this.dataInicioTrabalho = dataInicioTrabalho;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
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
        Professor professor = (Professor) o;
        return id == professor.id && Objects.equals(SIAPE, professor.SIAPE) && Objects.equals(dataInicioTrabalho, professor.dataInicioTrabalho) && Objects.equals(senha, professor.senha) && Objects.equals(pessoa, professor.pessoa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, SIAPE, dataInicioTrabalho, senha, pessoa);
    }

    @Override
    public String toString() {
        return "Professor{" +
                "id=" + id +
                ", SIAPE='" + SIAPE + '\'' +
                ", dataInicioTrabalho=" + dataInicioTrabalho +
                ", senha='" + senha + '\'' +
                ", pessoa=" + pessoa +
                '}';
    }
}
