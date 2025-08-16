package com.produtoapi.model;

import jakarta.annotation.Generated;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
public class Produto {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;


    //@NotEmpty(message = "Informe um nome")

    private String nome;

    private Integer quantidade;
    private Double preco;
    private String status;

    public Produto() {

    }


    public Produto(String nome, Integer Quantidade, Double preco, String status) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
        this.status = status;


    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;

    }







}

