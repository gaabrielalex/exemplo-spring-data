package com.example.demo.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne // ou @ManyToOne, dependendo do seu design
    @JoinColumn(name = "pessoas_id", referencedColumnName = "id")
    private Pessoa pessoa;

    @Column(name = "data_de_cadastro")
    @Temporal(TemporalType.DATE)
    private Date dataDeCadastro;

    @Column(name = "status", length = 10)
    private String status;

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

    public Date getDataDeCadastro() {
        return dataDeCadastro;
    }

    public void setDataDeCadastro(Date dataDeCadastro) {
        this.dataDeCadastro = dataDeCadastro;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}

