package io.github.brunobgcardoso.domain.entity;

import javax.persistence.OrderBy;

public class Cliente {

    private Integer id;
    private String nome;

    public Cliente(String nome, Integer id) {
        this.nome = nome;
        this.id = id;
    }

    public Cliente() {

    }

    @Override
    public String toString(){
        return "Cliente{"+
                "id = " + this.getId() +
                ", nome = " + this.getNome() +
                "}";
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
