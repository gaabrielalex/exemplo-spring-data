package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "alunos")
public class Aluno {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne // ou @ManyToOne, dependendo do seu design
    @JoinColumn(name = "pessoas_id", referencedColumnName = "id")
    private Pessoa pessoa;

    @Column(name = "matricula", nullable = false)
    private Integer matricula;

    @Column(name = "ano_ingresso", nullable = false)
    private Integer anoIngresso;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

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
