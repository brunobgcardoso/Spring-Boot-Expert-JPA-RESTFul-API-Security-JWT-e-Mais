package io.github.brunobgcardoso.domain.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(length = 100)
    private String nome;

    @OneToMany(mappedBy = "cliente")
    private Set<Pedido> pedidos;

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

    public Set<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(Set<Pedido> pedidos) {
        this.pedidos = pedidos;
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
