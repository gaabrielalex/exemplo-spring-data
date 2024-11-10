package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "professores")
public class Professor extends Pessoa {

    @Column(length = 45, nullable = false)
    private String areaDeAtuacao;

    @Column(nullable = false)
    private Integer numeroDeRegistro;

    public String getAreaDeAtuacao() {
        return areaDeAtuacao;
    }

    public void setAreaDeAtuacao(String areaDeAtuacao) {
        this.areaDeAtuacao = areaDeAtuacao;
    }

    public Integer getNumeroDeRegistro() {
        return numeroDeRegistro;
    }

    public void setNumeroDeRegistro(Integer numeroDeRegistro) {
        this.numeroDeRegistro = numeroDeRegistro;
    }

}
