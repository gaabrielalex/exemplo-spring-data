package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "alunos")
public class Aluno extends Pessoa {

    @Column(nullable = false)
    private Integer matricula;

    @Column(nullable = false)
    private Integer anoIngresso;

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public Integer getAnoIngresso() {
        return anoIngresso;
    }

    public void setAnoIngresso(Integer anoIngresso) {
        this.anoIngresso = anoIngresso;
    }
}
