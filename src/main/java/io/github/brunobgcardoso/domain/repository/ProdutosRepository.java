package io.github.brunobgcardoso.domain.repository;

import io.github.brunobgcardoso.domain.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutosRepository extends JpaRepository<Produto, Integer> {
}
