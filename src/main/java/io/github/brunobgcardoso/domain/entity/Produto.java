package io.github.brunobgcardoso.domain.entity;

import java.math.BigDecimal;

public class Produto {

    private Integer id;
    private String descricao;
    private BigDecimal preco;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getPreco_unitario() {
        return preco;
    }

    public void setPreco_unitario(BigDecimal preco) {
        this.preco = preco;
    }
}
