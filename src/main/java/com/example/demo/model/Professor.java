package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "professores")
public class Professor {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne // ou @ManyToOne, dependendo do seu design
    @JoinColumn(name = "pessoas_id", referencedColumnName = "id")
    private Pessoa pessoa;

    @Column(name = "area_de_atuacao", length = 45, nullable = false)
    private String areaDeAtuacao;

    @Column(name = "numero_de_registro", nullable = false)
    private Integer numeroDeRegistro;

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
